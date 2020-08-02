package com.texas.student.management.controller.routine;

import com.texas.student.management.exception.grade.RecordNotFoundException;
import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.model.routine.Routine;
import com.texas.student.management.service.routine.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/routine")
public class RoutineController {
/*

    private RoutineService service;

    @Autowired
    public RoutineController(RoutineService service) {
        this.service = service;
    }

    @ResponseBody
    @PostMapping("/addRoutine")
    public void addRoutine(@RequestBody Routine routine) {
        service.saveRoutine(routine);
    }

    @GetMapping("/routineById/{id}")
    public Optional<Routine> findRoutineById(@PathVariable long id) {
        return service.getRoutineById(id);
    }

    @PutMapping("/update")
    public Routine updateRoutine(@RequestBody Routine routine) {
        return service.updateRoutine(routine);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoutine(@PathVariable long id) {
        return service.deleteRoutine(id);
    }
*/

    private RoutineService service;

    @Autowired
    public RoutineController(RoutineService service) {
        this.service = service;
    }

   /* @GetMapping("/{id}")
    @ResponseBody
    public Optional<Routine> findRoutineById(@PathVariable(name="id")Long id)
    {
        return service.getRoutineById(id);
    }*/

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Routine> findRoutineById(@PathVariable(name = "id") Long id) {
        Optional<Routine> routine = service.getRoutineById(id);
        if (routine.isPresent()) {
            return new ResponseEntity<>(routine.get(), HttpStatus.FOUND);
        }
        throw new RecordNotFoundException("Data of the provided id :" + id + " is not present in the database.");
    }

    /*
    @ResponseBody
    @GetMapping
    public List<Routine> getAll(){
        return service.getAll();
    }*/

    @ResponseBody
    @GetMapping
    public ResponseEntity<List<Routine>> getAll() {
        List<Routine> routines = service.getAll();
        if (routines.isEmpty()) {
            throw new RecordNotFoundException("No Data is present.");
        }
        return new ResponseEntity<List<Routine>>(routines, HttpStatus.FOUND);
    }


  /*  @ResponseBody
    @PostMapping
    public void addRoutine(@RequestBody Routine routine)
    {
        service.saveRoutine(routine);
    }*/

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> addRoutine(@RequestBody Routine routine) {
        service.saveRoutine(routine);
        return new ResponseEntity<String>("Routine is created", HttpStatus.CREATED);
    }


  /*  @PutMapping(path = "/{id}")
    @ResponseBody
    public void updateRoutine(@PathVariable("id") Long id, @RequestBody Routine routine) {
        service.updateRoutine(routine);
    }*/

    @PutMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<String> updateRoutine(@PathVariable("id") Long id, @RequestBody Routine routine) {
        Optional<Routine> routine1 = service.getRoutineById(id);
        if (routine1.isPresent()) {
            service.updateRoutine(id, routine);
            return new ResponseEntity<String>("Data is updated", HttpStatus.OK);
        }
        throw new RecordNotFoundException("The provides id :" + id + "is not found");
    }



   /* @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteRoutine(@PathVariable Long id) {
        return service.deleteRoutine(id);
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRoutine(@PathVariable Long id) {
        Optional<Routine> routineOptional = service.getRoutineById(id);
        if (routineOptional.isPresent()) {
            service.deleteRoutine(id);
            return new ResponseEntity<String>("The routine having id " + id + "is deleted ", HttpStatus.RESET_CONTENT);
        }
        throw new RecordNotFoundException("Routine having id :" + id + " is not found");

    }

    //Grade specific routine with id
    @ResponseBody
    @GetMapping("/grade/{id}")
    public List<Routine> getByGradeId(@PathVariable(name="id") Long id)
    {
       return service.getByGradeId(id);
    }

//    Grade specific routine of specific day
    @ResponseBody
    @GetMapping("/grade/day/{id}/{day}")
    public List<Routine> getAllByGrade( @PathVariable Long id,@PathVariable(name = "day") Routine.Day day)
    {
        return service.getRoutineByDay(id,day);
    }

//For current Routine
//   current/gradeid/day(ie,SUNDAY,MONDAY)/startTime

    @ResponseBody
    @GetMapping("/current/{id}/{day}/{startTime}")
    public List<Routine> getCurrentRoutine(@PathVariable Long id, @PathVariable(name="day") Routine.Day day, @PathVariable(name = "startTime") String startTime)
    {
        return service.getCurrentRoutine(id,day,startTime);
    }

}