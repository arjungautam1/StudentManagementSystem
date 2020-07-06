package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.Student;
import com.texas.student.management.service.user.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {


    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @ResponseBody
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    @ResponseBody
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Student> findById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteStudentRecord(@PathVariable Long id)
    {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        studentService.updateStudent(id,student);

    }
}
