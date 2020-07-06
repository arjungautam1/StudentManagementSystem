package com.texas.student.management.model.attendence;

import com.texas.student.management.model.course.Course;
import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.model.user.User;

import javax.persistence.*;

@Entity
@Table(name = "course_based_attendence")
public class CourseBasedAttendance extends Attendance {

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;


    @Column(name = "Verified")
    private boolean verified;

    /*
    * what is current time
    *
    * */

    @ManyToOne
    @JoinColumn(name="conducted_by_user_id")
    private User user;


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
}
