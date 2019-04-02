package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Complaint {
    @Id
    private int complaintId;

    @Column
    private String description;

    @ManyToOne
    private Disabled disabledId;

    @ManyToOne
    private Helper helperId;

    @Column
    private Date date;

    @Column
    private Time time;

    public Complaint() { }

    public int getComplaintId() { return complaintId; }

    public void setComplaintId(int complaintId) { this.complaintId = complaintId; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Disabled getDisabledId() { return disabledId; }

    public void setDisabledId(Disabled disabledId) { this.disabledId = disabledId; }

    public Helper getHelperId() { return helperId; }

    public void setHelperId(Helper helperId) { this.helperId = helperId; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public Time getTime() { return time; }

    public void setTime(Time time) { this.time = time; }

}
