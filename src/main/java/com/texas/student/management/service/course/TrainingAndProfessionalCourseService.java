package com.texas.student.management.service.course;

import com.texas.student.management.model.course.TrainingAndProfessionalCourse;

import java.util.List;
import java.util.Optional;

public interface TrainingAndProfessionalCourseService {
    List<TrainingAndProfessionalCourse> getAll();

    void addCourse(TrainingAndProfessionalCourse trainingAndProfessionalCourse);

    Optional<TrainingAndProfessionalCourse> getByCode(String code);

    void deleteCourse(String code);

    void updateCourse(String code, TrainingAndProfessionalCourse trainingAndProfessionalCourse);
}
