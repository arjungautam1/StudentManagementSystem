package com.texas.student.management.controller.course;

import com.texas.student.management.model.course.TrainingAndProfessionalCourse;
import com.texas.student.management.service.course.TrainingAndProfessionalCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/trainingandprofessionalcourse")
public class TrainingAndProfessionalCourseController {

    private TrainingAndProfessionalCourseService trainingAndProfessionalCourseService;
    @Autowired
    public TrainingAndProfessionalCourseController(TrainingAndProfessionalCourseService trainingAndProfessionalCourseService) {
        this.trainingAndProfessionalCourseService = trainingAndProfessionalCourseService;
    }

    @GetMapping
    @ResponseBody
    public List<TrainingAndProfessionalCourse> getAll(){
        return trainingAndProfessionalCourseService.getAll();
    }

    @PostMapping
    @ResponseBody
    public void addCourses(@RequestBody TrainingAndProfessionalCourse trainingAndProfessionalCourse){
        trainingAndProfessionalCourseService.addCourse(trainingAndProfessionalCourse);
    }

    @GetMapping(path = "/{code}")
    @ResponseBody
    public Optional<TrainingAndProfessionalCourse> getByCode(@PathVariable("code") String code){
        return trainingAndProfessionalCourseService.getByCode(code);
    }

    @DeleteMapping(path = "/{code}")
    @ResponseBody
    public void deleteCourse(@PathVariable("code")String code){
        trainingAndProfessionalCourseService.deleteCourse(code);
    }

    @PutMapping(path = "/{code}")
    @ResponseBody
    public void updateCourse(@PathVariable("code") String code,@RequestBody TrainingAndProfessionalCourse trainingAndProfessionalCourse){
        trainingAndProfessionalCourseService.updateCourse(code,trainingAndProfessionalCourse);
    }
}
