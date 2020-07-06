package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Student;
import com.texas.student.management.model.user.User;
import com.texas.student.management.repository.student.StudentRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository userRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
     *
     * just an example
     *
     *
     * */


    @Override
    public List<Student> getAllStudentsByGender(User.Gender gender) {
       return Collections.emptyList();
    }

    /*  @Override
        public List<Student> getAllStudentsByGender(User.Gender gender) {
            return userRepository.findUsersByGender(gender);
        }


    */
    @Override
    public List<Student> getAllStudents() {
        /*
         * for test.....
         *
         *
         * */
        if(true)
            return IterableListConvertable.getListFromIterable(userRepository.findAll());
        else
            /*
            * only returing male students.........
            *
            * */
            return IterableListConvertable.getListFromIterable(userRepository.findAll()).stream().filter(
                    student -> student.getUser().getGender() == User.Gender.MALE
            ).collect(Collectors.toList());
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void addStudent(Student student) {
        userRepository.save(student);

    }

    @Override
    public void deleteStudentById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public void updateStudent(Long id, Student student) {
        userRepository.save(student);


    }
}
