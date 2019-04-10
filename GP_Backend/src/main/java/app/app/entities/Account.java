package app.app.entities;

import javax.persistence.*;

@Inheritance
@Entity
public class Account {
    @Id
    private String email;

    @Column
    private String fname;

    @Column
    private String lname;

    @Column
    private String password;

    @Column
    private String age;

    @Column
    private String phoneNumber;

    public Account() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }

    public void setLname(String lname) { this.lname = lname; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
