package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Student;
import com.texas.student.management.model.user.User;

import java.util.List;
import java.util.Optional;

public interface StudentService {
   List<Student> getAllStudentsByGender(User.Gender gender);

   List<Student> getAllStudents();

   Optional<Student> getStudentById(Long id);

   void addStudent(Student student);

   void deleteStudentById(Long id);

   void updateStudent(Long id,Student student);
}
