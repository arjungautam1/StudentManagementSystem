package com.texas.student.management.repository.course;

import com.texas.student.management.model.course.AcademicCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicCourseRepository extends CrudRepository<AcademicCourse, String> {
}
