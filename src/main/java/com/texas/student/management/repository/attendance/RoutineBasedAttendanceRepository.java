package com.texas.student.management.repository.attendance;

import com.texas.student.management.model.attendence.RoutineBasedAttendence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoutineBasedAttendanceRepository extends CrudRepository<RoutineBasedAttendence,Long> {


}