package app.app.entities.repositories;

import app.app.entities.FeedbackQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackQuestionRepository extends CrudRepository<FeedbackQuestion, Integer> {
}
