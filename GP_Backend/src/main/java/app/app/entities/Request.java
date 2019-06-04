package app.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {

    @Id
    @GeneratedValue
    private int requestId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service serviceId;

    private String disabledId;

    private String helperId;

    @Column
    private String location;

    @Column
    private String date;

    @Column
    private String payMethod;

    @Column
    private boolean requestState;

    public Request() { }

    public int getRequestId() { return requestId; }

    public void setRequestId(int requestId) { this.requestId = requestId; }

    public Service getServiceId() { return serviceId; }

    public void setServiceId(Service serviceId) { this.serviceId = serviceId; }

    public String getDisabledId() { return disabledId; }

    public void setDisabledId(String disabledId) { this.disabledId = disabledId; }

    public String getHelperId() { return helperId; }

    public void setHelperId(String helperId) { this.helperId = helperId; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    /*public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }*/

    public String getPayMethod() { return payMethod; }

    public void setPayMethod(String payMethod) { this.payMethod = payMethod; }

    public boolean isRequestState() { return requestState; }

    public void setRequestState(boolean requestState) { this.requestState = requestState; }

}
