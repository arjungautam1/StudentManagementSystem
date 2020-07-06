package com.texas.student.management.model.course;

import javax.persistence.*;

@Entity
@Table(name = "training_course")
public class TrainingAndProfessionalCourse{

    @Id
    private String id;

    private Levels levels;
    private int duration;  /*in hours */

    public enum Levels{
        BASIC,
        INTERMEDIATE,
        PROFESSIONAL
    }

    @OneToOne
    @MapsId
    private Course course;


    //getter and setter
    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
