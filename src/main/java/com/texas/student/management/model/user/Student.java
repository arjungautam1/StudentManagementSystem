package com.texas.student.management.model.user;
import javax.persistence.*;


/*
*
* {

    "id":1,
    "regNumber":"651651asdfasd3165",
    "symbolNumber":"9841367709",
    "user":{
        "id":1
    }
}
*
* */

@Entity
@Table(name = "student")
public class Student  {

    @Id
    private Long id;

    private String regNumber;
    private String symbolNumber;

    @OneToOne
    @MapsId
    private User user;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gid", unique = true)
    private Guardian guardian;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getSymbolNumber() {
        return symbolNumber;
    }

    public void setSymbolNumber(String symbolNumber) {
        this.symbolNumber = symbolNumber;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
