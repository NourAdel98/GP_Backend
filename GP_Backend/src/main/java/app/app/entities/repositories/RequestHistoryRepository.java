package app.app.entities.repositories;

import app.app.entities.RequestHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestHistoryRepository extends CrudRepository<RequestHistory, Integer> {
}
