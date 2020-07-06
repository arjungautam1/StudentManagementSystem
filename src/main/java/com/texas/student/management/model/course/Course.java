package com.texas.student.management.model.course;


//import com.texas.student.management.model.user.CourseTeacher;

import javax.persistence.Entity;
import javax.persistence.Id;


/*
*
{
  "code":"CN2",
    "name":"Computer Network"
     }
*
*
*
*
* */

@Entity
public class Course {
    /*
    * add totalDurtion,
    * add Other common things
    *
    *
    * approvedBy --> either university or TexasCollege
    *
    *
    *
    *
    *
    * */


    @Id
    private String code;
    /*
    *
    * For academic course, code given by university will be assigned
    * For training and other professional course u can have manual code
    * for eg: IMAGINOLOGY_INTERMIDIATE(imaginology_intermediate)
    *
    *
    *
    * it can be further discussed
    *
    * */
    private String name;

// to remove infinite loop error and bidirectional
//    @ManyToMany(mappedBy = "courses")
//    private Set<CourseTeacher>  courseTeachers;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

//    public Set<CourseTeacher> getCourseTeachers() {
//        return courseTeachers;
//    }
//
//    public void setCourseTeachers(Set<CourseTeacher> courseTeachers) {
//        this.courseTeachers = courseTeachers;
//    }

    /*
    * setType
    *git branch
    * */
}
