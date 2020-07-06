package com.texas.student.management.model.routine;

import com.texas.student.management.model.course.Course;
import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.model.user.CourseTeacher;

import javax.persistence.*;

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
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    @OneToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private CourseTeacher teacher;

    private long startTime;
    private long endTime;
    private Day day;
    enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDENSDAY,THURSDAY,FRIDAY,SATURDAY
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}