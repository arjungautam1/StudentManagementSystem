package com.texas.student.management.repository.course;

import com.texas.student.management.model.course.TrainingAndProfessionalCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingAndProfessionalCourseRepository extends CrudRepository<TrainingAndProfessionalCourse,String> {
}
