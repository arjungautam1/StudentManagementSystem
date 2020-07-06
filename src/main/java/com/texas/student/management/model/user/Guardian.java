package com.texas.student.management.model.user;

import javax.persistence.*;



/*
* This approach is just foreign key
*
*
*
*
* */

/*
*
* {
        "fullName": "Radha Krishna Mainali",
        "phoneNumber": "9841367709",
        "phoneNumberOptional": "9841367709",
        "occupation": "Farmer"
    }
*
*
* */

@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gid")
    private int gId;
    private String fullName;
    private String phoneNumber;
    private String phoneNumberOptional;
    private String occupation;

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberOptional() {
        return phoneNumberOptional;
    }

    public void setPhoneNumberOptional(String phoneNumberOptional) {
        this.phoneNumberOptional = phoneNumberOptional;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
