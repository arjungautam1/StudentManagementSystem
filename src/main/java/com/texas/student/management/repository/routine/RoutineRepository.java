package com.texas.student.management.repository.routine;

import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.model.routine.Routine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Repository
public interface RoutineRepository  extends CrudRepository<Routine,Long> {
    List<Routine> findRoutineByGradeId(Long id);

    List<Routine> findRoutineByGradeIdAndDay(Long id,Routine.Day day);

    List<Routine> findRoutineByGradeIdAndDayAndStartTime(Long id, Routine.Day day, String startTime);

}
