package com.texas.student.management.service.course;

import com.texas.student.management.model.course.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<Course> getAllCourse();

    Optional<Course> getUserById(String id);

    void addCourse(Course user);

    void deleteCourseById(String id);

    void updateCourse(String id, Course user);
}
