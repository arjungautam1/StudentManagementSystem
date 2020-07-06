package com.texas.student.management.repository.grade;

import com.texas.student.management.model.grade.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends CrudRepository<Grade,Long> {
    


}
