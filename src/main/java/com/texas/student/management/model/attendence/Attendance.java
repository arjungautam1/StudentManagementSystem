package com.texas.student.management.model.attendence;

import com.texas.student.management.model.user.User;

import javax.persistence.*;
import java.io.Serializable;

/*
*
* use camel case
* */

@MappedSuperclass
public abstract class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

/*@Embeddable
class AttendenceKey implements Serializable {

    @Column(name = "user_id")
    long userID;

    @Column(name = "course_id")
    Long courseId;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}*/
