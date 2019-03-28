package app.app.entities.repositories;

import app.app.entities.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintRepository extends CrudRepository<Complaint, Integer> {

}
