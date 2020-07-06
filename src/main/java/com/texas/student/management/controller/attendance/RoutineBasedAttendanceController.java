package com.texas.student.management.controller.attendance;

import com.texas.student.management.model.attendence.RoutineBasedAttendence;
import com.texas.student.management.service.attendance.RoutineBasedAttendance.RoutineBasedAttendanceService;
import com.texas.student.management.service.attendance.RoutineBasedAttendance.RoutineBasedAttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/routinebasedattendance")
public class RoutineBasedAttendanceController {

    private RoutineBasedAttendanceService routineBasedAttendanceService;
    @Autowired
    public RoutineBasedAttendanceController(RoutineBasedAttendanceService routineBasedAttendanceService) {
        this.routineBasedAttendanceService = routineBasedAttendanceService;
    }

    @GetMapping( consumes = "application/json", produces = "application/json")
    @ResponseBody
    public List<RoutineBasedAttendence> getAll(){
        return routineBasedAttendanceService.getAllRoutineBasedAttendance();
    }


    @PostMapping( consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void addRoutineBasedAttendance(@RequestBody RoutineBasedAttendence routineBasedAttendance){
        routineBasedAttendanceService.addRoutineBasedAttendance(routineBasedAttendance);

    }
    @DeleteMapping(path="/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void deleteRoutineBasedAttendanceId(@PathVariable (name = "id") Long id){
        routineBasedAttendanceService.deleteRoutineBasedAttendanceById(id);
    }

    @GetMapping(path = "/{id}" , consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Optional<RoutineBasedAttendence> getRoutineBasedAttendanceById(@PathVariable(name = "id") Long id){
        return routineBasedAttendanceService.getRoutineBasedAttendanceById(id);
    }

    @PutMapping(path = "/{id}",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public void updateRoutineBasedAttendance(@PathVariable("id") Long id,@RequestBody RoutineBasedAttendence routineBasedAttendance){
        routineBasedAttendanceService.updateRoutineBasedAttendance(id,routineBasedAttendance);
    }

}

