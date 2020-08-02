package com.texas.student.management.service.routine;

import com.texas.student.management.model.routine.Routine;
import com.texas.student.management.repository.routine.RoutineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RoutineServiceImpl implements RoutineService {

    private RoutineRepository repository;
    /*For post method*/

    @Autowired
    public RoutineServiceImpl(RoutineRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveRoutine(Routine routine)
    {
        repository.save(routine);
    }
    /*For get method */

    @Override
    public Optional<Routine> getRoutineById(Long id)
    {
        return repository.findById(id);
    }
    /*for delete method*/

    @Override
    public String deleteRoutine(Long id)
    {
        repository.deleteById(id);
        return "Routine of id "+id+"deleted";
    }


    @Override
    public List<Routine> getAll(){
        return (List<Routine>) repository.findAll();

    }


    @Override
    public void updateRoutine(Long id, Routine routine) {
        repository.save(routine);
    }

    //For grade specific routine of grade id

    @Override
    public List<Routine> getByGradeId(Long id)
    {
        return repository.findRoutineByGradeId(id);

    }


//    For grade specific Routine of specific day

    @Override
    public List<Routine> getRoutineByDay(Long id,Routine.Day day){
        return repository.findRoutineByGradeIdAndDay(id,day);
    }

    //For current routine

    @Override
    public List<Routine> getCurrentRoutine(Long id, Routine.Day day, String startTime){
        return repository.findRoutineByGradeIdAndDayAndStartTime(id,day,startTime);
    }

}
