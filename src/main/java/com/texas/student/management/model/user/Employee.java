package com.texas.student.management.model.user;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


/*
*
* {

    "id":1,
    "qualification":"651651asdfasd3165",
    "symbolNumber":"9841367709",
    "user":{
        "id":1
    }
}
*
*
*
* */


@Entity
public class Employee {

    @Id
    private Long id;

    private String qualification;

    private String experience;

    @OneToOne
    @MapsId
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
