package app.app.entities.repositories;

import app.app.entities.RequestHistory;
import org.springframework.data.repository.CrudRepository;

public interface RequestHistoryRepository extends CrudRepository<RequestHistory, Integer> {
}
