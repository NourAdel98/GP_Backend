package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// still incomplete !!!
@Entity
public class Feedback {

    @Id
    @GeneratedValue
    private int feedbackId;

    private String disabledId;
}
