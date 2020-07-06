package com.texas.student.management.model.user;

import com.texas.student.management.model.course.Course;

import javax.persistence.*;
import java.util.Set;

/*
* Course Teacher might be other employee too i.e co-ordinator, hod, principle and rest others
*
*
* */


/*
*
* {

    "id":1,
    "teacherType":"FULL_TIME",
    "experience":"2 years 5 month",
    "employee":{
        "id":1
    }
}
*
*
* */


@Entity
public class CourseTeacher {
    @Id
    private Long id;


    private TeacherType teacherType;

    public enum TeacherType{
        FULL_TIME,
        PART_TIME
    }




    @OneToOne
    @JoinColumn(name = "employee_id", unique = true)
    private Employee employee;

    /*
     *
     * we are using pivot table called course_assigned_teacher
     *
     * */
    @ManyToMany
    @JoinTable(
            name = "course_assigned_teacher",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
