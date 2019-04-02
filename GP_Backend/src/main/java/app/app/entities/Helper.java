package app.app.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Helper extends Account {
    @OneToOne
    private Specialization specialization;

    @ManyToOne
    private Disabled disabled;

}
