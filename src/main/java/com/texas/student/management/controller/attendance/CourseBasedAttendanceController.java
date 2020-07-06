package com.texas.student.management.controller.attendance;

import com.texas.student.management.model.attendence.CourseBasedAttendance;
import com.texas.student.management.service.attendance.CourseBasedAttendance.CourseBasedAttendanceService;
import com.texas.student.management.service.attendance.CourseBasedAttendance.CourseBasedAttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/coursebasedattendance")
public class CourseBasedAttendanceController {

    private CourseBasedAttendanceService courseBasedAttendanceService;
    @Autowired
    public CourseBasedAttendanceController(CourseBasedAttendanceServiceImpl courseBasedAttendanceService) {
        this.courseBasedAttendanceService = courseBasedAttendanceService;
    }

    @GetMapping
    @ResponseBody
    public List<CourseBasedAttendance> getAll(){
        return courseBasedAttendanceService.getAllCourseBasedAttendance();
    }


    @PostMapping( consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void addCourseBasedAttendance(@RequestBody CourseBasedAttendance courseBasedAttendance){
        courseBasedAttendanceService.addCourseBasedAttendance(courseBasedAttendance);

    }
    @DeleteMapping(path="/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void deleteCourseBasedAttendanceId(@PathVariable (name = "id") Long id){
        courseBasedAttendanceService.deleteCourseBasedAttendanceById(id);
    }

    @GetMapping(path = "/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Optional<CourseBasedAttendance> getCourseBasedAttendanceById(@PathVariable(name = "id") Long id){
        return courseBasedAttendanceService.getCourseBasedAttendanceById(id);
    }

    @PutMapping(path = "/{id}",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public void updateCourseBasedAttendance(@PathVariable("id") Long id,@RequestBody CourseBasedAttendance courseBasedAttendance){
        courseBasedAttendanceService.updateCourseBasedAttendance(id,courseBasedAttendance);
    }

}

