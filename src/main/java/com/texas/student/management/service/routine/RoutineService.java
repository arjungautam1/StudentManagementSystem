package com.texas.student.management.service.routine;

import com.texas.student.management.model.routine.Routine;
import com.texas.student.management.repository.routine.RoutineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoutineService {

    private RoutineRepository repository;
    /*For post method*/

    @Autowired
    public RoutineService(RoutineRepository repository) {
        this.repository = repository;
    }

    public void saveRoutine(Routine routine)
    {
         repository.save(routine);
    }
    /*For get method */
    public Optional<Routine> getRoutineById(Long id)
    {
        return repository.findById(id);
    }
    /*for delete method*/
    public String deleteRoutine(Long id)
    {
        repository.deleteById(id);
        return "Routine of id "+id+"deleted";
    }
    /*For update method*/
    public Routine updateRoutine(Routine routine)
    {
        Routine existingRoutine=repository.findById(routine.getId()).orElse(new Routine());
        existingRoutine.setDay(routine.getDay());
        existingRoutine.setCourse(routine.getCourse());
        existingRoutine.setStartTime(routine.getStartTime());
        existingRoutine.setEndTime(routine.getEndTime());
        existingRoutine.setTeacher(routine.getTeacher());
        return repository.save(existingRoutine);
    }
}