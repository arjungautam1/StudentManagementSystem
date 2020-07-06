package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.CourseTeacher;
import com.texas.student.management.model.user.Student;
import com.texas.student.management.service.user.CourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/courseTeacher")
public class CourseTeacherController {

    private CourseTeacherService courseTeacherService;
    @Autowired

    public CourseTeacherController(CourseTeacherService courseTeacherService) {
        this.courseTeacherService = courseTeacherService;
    }

    @GetMapping
    @ResponseBody
    public List<CourseTeacher> getAllCourseTeachers(){
        return courseTeacherService.getAllCourseTeacher();
    }

    @PostMapping
    @ResponseBody
    public void addCourseTeacherRecord(@RequestBody CourseTeacher courseTeacher){
       courseTeacherService.addCourseTeacherRecord(courseTeacher);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<CourseTeacher> findById(@PathVariable Long id)
    {
        return courseTeacherService.getCourseTeacherById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteCourseTeacherRecord(@PathVariable Long id)
    {
        courseTeacherService.deleteCourseTeacherRecord(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateCourseTeacher(@PathVariable("id") Long id, @RequestBody CourseTeacher courseTeacher) {
        courseTeacherService.updateCourseTeacherRecord(id,courseTeacher);

    }


}
