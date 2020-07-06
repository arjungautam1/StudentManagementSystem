package com.texas.student.management.repository.attendance;

import com.texas.student.management.model.attendence.CourseBasedAttendance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CourseBasedAttendanceRepository extends CrudRepository<CourseBasedAttendance,Long> {


}