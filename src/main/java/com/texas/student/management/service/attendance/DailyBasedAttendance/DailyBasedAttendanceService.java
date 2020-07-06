package com.texas.student.management.service.attendance.DailyBasedAttendance;

import com.texas.student.management.model.attendence.DailyBasedAttendance;



import java.util.List;
import java.util.Optional;

public interface DailyBasedAttendanceService {

    List<DailyBasedAttendance> getAllDailyBasedAttendance();

    void addDailyBasedAttendance(DailyBasedAttendance dailyBasedAttendance);

    void deleteDailyBasedAttendanceById(Long id);

    Optional<DailyBasedAttendance> getDailyBasedAttendanceById(Long id);




    void updateDailyBasedAttendance(Long id, DailyBasedAttendance dailyBasedAttendance);
}