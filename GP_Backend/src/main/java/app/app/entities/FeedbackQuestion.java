package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeedbackQuestion {

    @Id
    @GeneratedValue
    private int questionId;

    @Column
    private String description;

    public FeedbackQuestion() { }

    public int getQuestionId() { return questionId; }

    public void setQuestionId(int questionId) { this.questionId = questionId; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}
