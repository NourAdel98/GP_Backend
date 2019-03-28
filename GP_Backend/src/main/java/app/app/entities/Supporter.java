package app.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Supporter extends Account {

    @Column
    private String Address;

    public String getAddress() { return Address; }

    public void setAddress(String address) { Address = address; }
}
