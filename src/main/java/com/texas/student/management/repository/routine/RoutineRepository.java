package com.texas.student.management.repository.routine;

import com.texas.student.management.model.routine.Routine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository  extends CrudRepository<Routine,Long> {
}
