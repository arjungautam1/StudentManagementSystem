package com.texas.student.management.service.user;

import com.texas.student.management.model.user.CourseTeacher;

import java.util.List;
import java.util.Optional;

public interface CourseTeacherService {

    List<CourseTeacher> getAllCourseTeacher();

    Optional<CourseTeacher> getCourseTeacherById(Long id);

    void addCourseTeacherRecord(CourseTeacher courseTeacher);

    void deleteCourseTeacherRecord(Long id);

    void updateCourseTeacherRecord(Long id,CourseTeacher courseTeacher);


}
