package com.texas.student.management.service.routine;

import com.texas.student.management.model.routine.Routine;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RoutineService {

    void saveRoutine(Routine routine);

    Optional<Routine> getRoutineById(Long id);

    String deleteRoutine(Long id);

    List<Routine> getAll();

    void updateRoutine(Long id, Routine routine);

    List<Routine> getByGradeId(Long id);

    List<Routine> getRoutineByDay(Long id , Routine.Day day);

  List<Routine> getCurrentRoutine(Long id, Routine.Day day, String startTime);



}