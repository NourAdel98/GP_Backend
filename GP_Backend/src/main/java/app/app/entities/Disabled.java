package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Disabled extends Account{
    @Column
    private String Address;

    @Column
    private String disabilityType;

    public String getAddress() { return Address; }

    public void setAddress(String address) { Address = address; }

    public String getDisabilityType() { return disabilityType; }

    public void setDisabilityType(String disabilityType) { this.disabilityType = disabilityType; }
}
