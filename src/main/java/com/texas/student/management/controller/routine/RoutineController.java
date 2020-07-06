package com.texas.student.management.controller.routine;

import com.texas.student.management.model.routine.Routine;
import com.texas.student.management.service.routine.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class RoutineController {

    private RoutineService service;

    @Autowired
    public RoutineController(RoutineService service) {
        this.service = service;
    }

    @ResponseBody
    @PostMapping("/addRoutine")
    public void addRoutine(@RequestBody Routine routine)
    {
         service.saveRoutine(routine);
    }
    @GetMapping("/routineById/{id}")
    public Optional<Routine> findRoutineById(@PathVariable long id)
    {
        return service.getRoutineById(id);
    }
    @PutMapping("/update")
    public Routine updateRoutine(@RequestBody Routine routine)
    {
        return service.updateRoutine(routine);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteRoutine(@PathVariable long id)
    {
        return service.deleteRoutine(id);
    }

}