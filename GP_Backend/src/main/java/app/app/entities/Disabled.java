package app.app.entities;

import javax.persistence.*;

@Entity
public class Disabled extends Account {
    @Column
    private String Address;

    @Column
    private String disabilityType;

    @ManyToOne
    private Helper helper;

    @ManyToOne
    private Supporter supporter;

    public String getAddress() { return Address; }

    public void setAddress(String address) { Address = address; }

    public String getDisabilityType() { return disabilityType; }

    public void setDisabilityType(String disabilityType) { this.disabilityType = disabilityType; }

}
