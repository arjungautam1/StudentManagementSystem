package com.texas.student.management.service.attendance.CourseBasedAttendance;

import com.texas.student.management.model.attendence.CourseBasedAttendance;



import java.util.List;
import java.util.Optional;

public interface CourseBasedAttendanceService {

   List<CourseBasedAttendance> getAllCourseBasedAttendance();

   void addCourseBasedAttendance(CourseBasedAttendance courseBasedAttendance);

   void deleteCourseBasedAttendanceById(Long id);

   Optional<CourseBasedAttendance> getCourseBasedAttendanceById(Long id);




    void updateCourseBasedAttendance(Long id, CourseBasedAttendance courseBasedAttendance);
}