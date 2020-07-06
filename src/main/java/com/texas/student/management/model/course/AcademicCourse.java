package com.texas.student.management.model.course;


import javax.persistence.*;


/*
* if we go with delegation model we can have one course which can be professional as well as academic course
*
*
*
*
* we can also put id as long
*
*
*
* */


/*
*
*  {"fullMark":100,
    "passMark":35,
    "theoryFullMark":25,
    "theoryPassMark":15,
    "practicalFullMark":25,
    "id":"CN2",
    "practicalPassMark":15,
    "course":{
        "code": "CN2"
    },
*
*
* */

@Entity
@Table(name = "academic_course")
public class AcademicCourse  {

    @Id
    private String  id;

    private int fullMark;
    private int passMark;
    private int theoryFullMark;
    private int theoryPassMark;
    private int practicalFullMark;
    private int practicalPassMark;


    @OneToOne
    @MapsId
    private Course course;

//    getter and setter
    public int getFullMark() {
        return fullMark;
    }

    public void setFullMark(int fullMark) {
        this.fullMark = fullMark;
    }

    public int getPassMark() {
        return passMark;
    }

    public void setPassMark(int passMark) {
        this.passMark = passMark;
    }

    public int getTheoryFullMark() {
        return theoryFullMark;
    }

    public void setTheoryFullMark(int theoryFullMark) {
        this.theoryFullMark = theoryFullMark;
    }

    public int getTheoryPassMark() {
        return theoryPassMark;
    }

    public void setTheoryPassMark(int theoryPassMark) {
        this.theoryPassMark = theoryPassMark;
    }

    public int getPracticalFullMark() {
        return practicalFullMark;
    }

    public void setPracticalFullMark(int practicalFullMark) {
        this.practicalFullMark = practicalFullMark;
    }

    public int getPracticalPassMark() {
        return practicalPassMark;
    }

    public void setPracticalPassMark(int practicalPassMark) {
        this.practicalPassMark = practicalPassMark;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
