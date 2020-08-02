package com.texas.student.management.model.routine;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.texas.student.management.model.course.Course;
import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.model.user.CourseTeacher;

//Routine Entity

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
*
*
* {

    "startTime":100254552,
    "endTime":2004252252,
    "day":"SUNDAY",
    "course":{
        "code": "CN2"
    },
    "grade":{
        "id": 4
    },
    "teacher":{
        "id":1
    }
}
*
*
*
* */


@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    @OneToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private CourseTeacher teacher;

    /*String , publish, duration */
    private String startTime;
    private String endTime;

    private Day day;


    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDENSDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public CourseTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(CourseTeacher teacher) {
        this.teacher = teacher;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}