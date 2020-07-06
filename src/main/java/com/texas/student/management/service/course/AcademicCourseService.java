package com.texas.student.management.service.course;

import com.texas.student.management.model.course.AcademicCourse;

import java.util.List;
import java.util.Optional;

public interface AcademicCourseService {
    List<AcademicCourse> getAll();

    void addAcademicCourse(AcademicCourse academicCourse);

    Optional<AcademicCourse> getByCode(String code);

    void deleteAcademicCourse(String code);

    void updateAcademicCourse(String code,AcademicCourse academicCourse);
}
