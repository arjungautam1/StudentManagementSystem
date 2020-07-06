package com.texas.student.management.controller.course;

import com.texas.student.management.model.course.Course;
import com.texas.student.management.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/course")
public class CourseController {
    private CourseService userService;
    @Autowired
    public CourseController(CourseService userService) {
        this.userService = userService;
    }


    @GetMapping
    @ResponseBody
    public List<Course> getAllCourse(){
        return userService.getAllCourse();
    }

    @PostMapping
    @ResponseBody
    public void addCourse(@RequestBody Course course){
        userService.addCourse(course);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Course> findById(@PathVariable String id)
    {
        return userService.getUserById(id);
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteStudentRecord(@PathVariable String id)
    {
        userService.deleteCourseById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateStudent(@PathVariable("id") String id, @RequestBody Course user) {
        userService.updateCourse(id,user);

    }
}
