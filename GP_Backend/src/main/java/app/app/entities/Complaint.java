package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Complaint {
    @Id
    private int complaintId;

    @Column
    private String description;
    @Column
    private Date date;

    @Column
    private Time time;

    public Complaint() { }

    public int getComplaintId() { return complaintId; }

    public void setComplaintId(int complaintId) { this.complaintId = complaintId; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public Time getTime() { return time; }

    public void setTime(Time time) { this.time = time; }


}
