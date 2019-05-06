package app.app.entities.repositories;

import app.app.entities.FeedbackAnswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackAnswerRepository extends CrudRepository<FeedbackAnswer, Integer> {
}
