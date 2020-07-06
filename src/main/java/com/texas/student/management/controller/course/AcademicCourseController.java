package com.texas.student.management.controller.course;

import com.texas.student.management.model.course.AcademicCourse;
import com.texas.student.management.service.course.AcademicCourseService;
import com.texas.student.management.service.course.AcademicCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/academiccourse")
public class AcademicCourseController {

    private AcademicCourseService academicCourseService;
    @Autowired
    public AcademicCourseController(AcademicCourseServiceImpl academicCourseService) {
        this.academicCourseService = academicCourseService;
    }

    @GetMapping
    @ResponseBody
    public List<AcademicCourse> getAll(){
        return academicCourseService.getAll();
    }

    @PostMapping
    @ResponseBody
    public void addAcademicCourse(@RequestBody AcademicCourse academicCourse){
        academicCourseService.addAcademicCourse(academicCourse);
    }

    @GetMapping(path = "/{code}")
    @ResponseBody
    public Optional<AcademicCourse> getByCode(@PathVariable("code") String code){
        return academicCourseService.getByCode(code);
    }

    @DeleteMapping(path = "/{code}")
    @ResponseBody
    public void deleteAcademicCourse(@PathVariable("code") String code){
        academicCourseService.deleteAcademicCourse(code);
    }

    @PutMapping(path = "/{code}")
    @ResponseBody
    public void updateAcademicCourse(@PathVariable("code") String code,@RequestBody AcademicCourse academicCourse){
        academicCourseService.updateAcademicCourse(code,academicCourse);
    }
}
