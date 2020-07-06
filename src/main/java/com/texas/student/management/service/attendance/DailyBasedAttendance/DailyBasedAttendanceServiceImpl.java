package com.texas.student.management.service.attendance.DailyBasedAttendance;
import com.texas.student.management.model.attendence.DailyBasedAttendance;
import com.texas.student.management.repository.attendance.DailyBasedAttendanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DailyBasedAttendanceServiceImpl implements DailyBasedAttendanceService {

    private DailyBasedAttendanceRepository dailyBasedAttendanceRepository;
    @Autowired
    public DailyBasedAttendanceServiceImpl(DailyBasedAttendanceRepository dailyBasedAttendanceRepository) {
        this.dailyBasedAttendanceRepository = dailyBasedAttendanceRepository;
    }


    @Override
    public List<DailyBasedAttendance> getAllDailyBasedAttendance() {
        return (List<DailyBasedAttendance>) dailyBasedAttendanceRepository.findAll();
    }

    @Override
    public void addDailyBasedAttendance(DailyBasedAttendance dailyBasedAttendance) {
        dailyBasedAttendanceRepository.save(dailyBasedAttendance);
    }

    @Override
    public void deleteDailyBasedAttendanceById(Long id) {
        dailyBasedAttendanceRepository.deleteById(id);
    }

    @Override
    public Optional<DailyBasedAttendance> getDailyBasedAttendanceById(Long id) {
        return dailyBasedAttendanceRepository.findById(id);
    }



    @Override
    public void updateDailyBasedAttendance(Long id, DailyBasedAttendance dailyBasedAttendance) {
        dailyBasedAttendanceRepository.save(dailyBasedAttendance);

    }


}