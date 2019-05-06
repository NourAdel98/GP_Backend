package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Request {
    @Id
    @GeneratedValue
    private int requestId;

    private String disabledId;

    private String helperId;

    @Column
    private String location;

    @Column
    private Date date;

    @Column
    private Time time;

    @Column
    private String payMethod;

    @Column
    private boolean requestState;

    public Request() { }

    public int getRequestId() { return requestId; }

    public void setRequestId(int requestId) { this.requestId = requestId; }

    public String getDisabledId() { return disabledId; }

    public void setDisabledId(String disabledId) { this.disabledId = disabledId; }

    public String getHelperId() { return helperId; }

    public void setHelperId(String helperId) { this.helperId = helperId; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public Time getTime() { return time; }

    public void setTime(Time time) { this.time = time; }

    public String getPayMethod() { return payMethod; }

    public void setPayMethod(String payMethod) { this.payMethod = payMethod; }

    public boolean isRequestState() { return requestState; }

    public void setRequestState(boolean requestState) { this.requestState = requestState; }

}
