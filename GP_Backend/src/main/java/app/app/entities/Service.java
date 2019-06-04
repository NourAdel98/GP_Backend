package app.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Service {

    @Id
    private String description;

    @OneToMany(mappedBy = "serviceId")
    private List<Request> requests;

    public Service() { }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
