package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeedbackAnswer {

    @Id
    @GeneratedValue
    private int answerId;

    @Column
    private String description;

    public FeedbackAnswer() { }

    public int getAnswerId() { return answerId; }

    public void setAnswerId(int answerId) { this.answerId = answerId; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}
