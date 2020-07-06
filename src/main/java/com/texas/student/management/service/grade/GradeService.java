package com.texas.student.management.service.grade;

import com.texas.student.management.model.grade.Grade;


import java.util.List;
import java.util.Optional;

public interface GradeService {

    List<Grade> getAllGrade();

    void addGrade(Grade grade);

    void deleteGradeById(Long id);

    Optional<Grade> getGradeById(Long id);

    void updateGrade(Long id, Grade grade);
}
