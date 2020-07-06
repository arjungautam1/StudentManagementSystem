package com.texas.student.management.controller.attendance;

import com.texas.student.management.model.attendence.DailyBasedAttendance;
import com.texas.student.management.service.attendance.DailyBasedAttendance.DailyBasedAttendanceService;
import com.texas.student.management.service.attendance.DailyBasedAttendance.DailyBasedAttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/dailybasedattendance")
public class DailyBasedAttendanceController {

    private DailyBasedAttendanceService dailyBasedAttendanceService;
    @Autowired
    public DailyBasedAttendanceController(DailyBasedAttendanceServiceImpl dailyBasedAttendanceService) {
        this.dailyBasedAttendanceService = dailyBasedAttendanceService;
    }

    @GetMapping( consumes = "application/json", produces = "application/json")
    @ResponseBody
    public List<DailyBasedAttendance> getAll(){
        return dailyBasedAttendanceService.getAllDailyBasedAttendance();
    }


    @PostMapping( consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void addDailyBasedAttendance(@RequestBody DailyBasedAttendance dailyBasedAttendance){
        dailyBasedAttendanceService.addDailyBasedAttendance(dailyBasedAttendance);

    }
    @DeleteMapping(path="/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void deleteDailyBasedAttendanceId(@PathVariable (name = "id") Long id){
        dailyBasedAttendanceService.deleteDailyBasedAttendanceById(id);
    }

    @GetMapping(path = "/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Optional<DailyBasedAttendance> getDailyBasedAttendanceById(@PathVariable(name = "id") Long id){
        return dailyBasedAttendanceService.getDailyBasedAttendanceById(id);
    }

    @PutMapping(path = "/{id}",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public void updateDailyBasedAttendance(@PathVariable("id") Long id,@RequestBody DailyBasedAttendance dailyBasedAttendance){
        dailyBasedAttendanceService.updateDailyBasedAttendance(id,dailyBasedAttendance);
    }

}

