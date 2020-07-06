package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.Student;
import com.texas.student.management.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
   // List<Student> findUsersByGender(User.Gender gender);
}
