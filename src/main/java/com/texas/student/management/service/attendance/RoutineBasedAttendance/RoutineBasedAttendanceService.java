package com.texas.student.management.service.attendance.RoutineBasedAttendance;




import java.util.List;
import java.util.Optional;
import com.texas.student.management.model.attendence.RoutineBasedAttendence;

public interface RoutineBasedAttendanceService {

    List<RoutineBasedAttendence> getAllRoutineBasedAttendance();

    void addRoutineBasedAttendance(RoutineBasedAttendence routineBasedAttendance);

    void deleteRoutineBasedAttendanceById(Long id);

    Optional<RoutineBasedAttendence> getRoutineBasedAttendanceById(Long id);




    void updateRoutineBasedAttendance(Long id, RoutineBasedAttendence routineBasedAttendance);
}