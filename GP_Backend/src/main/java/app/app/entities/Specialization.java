package app.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Specialization {
    @Id
    private String description;
}
