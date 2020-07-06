package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.CourseTeacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseTeachingRepository extends CrudRepository<CourseTeacher,Long> {
}
