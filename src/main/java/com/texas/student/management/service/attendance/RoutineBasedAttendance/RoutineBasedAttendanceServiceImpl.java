package com.texas.student.management.service.attendance.RoutineBasedAttendance;

import com.texas.student.management.model.attendence.RoutineBasedAttendence;
import com.texas.student.management.repository.attendance.RoutineBasedAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoutineBasedAttendanceServiceImpl implements RoutineBasedAttendanceService {

    private RoutineBasedAttendanceRepository routineBasedAttendanceRepository;
    @Autowired
    public RoutineBasedAttendanceServiceImpl(RoutineBasedAttendanceRepository routineBasedAttendanceRepository) {
        this.routineBasedAttendanceRepository = routineBasedAttendanceRepository;
    }


    @Override
    public List<RoutineBasedAttendence> getAllRoutineBasedAttendance() {
        return (List<RoutineBasedAttendence>) routineBasedAttendanceRepository.findAll();
    }

    @Override
    public void addRoutineBasedAttendance(RoutineBasedAttendence routineBasedAttendance) {
        routineBasedAttendanceRepository.save(routineBasedAttendance);
    }

    @Override
    public void deleteRoutineBasedAttendanceById(Long id) {
        routineBasedAttendanceRepository.deleteById(id);
    }

    @Override
    public Optional<RoutineBasedAttendence> getRoutineBasedAttendanceById(Long id) {
        return routineBasedAttendanceRepository.findById(id);
    }



    @Override
    public void updateRoutineBasedAttendance(Long id, RoutineBasedAttendence routineBasedAttendance) {
        routineBasedAttendanceRepository.save(routineBasedAttendance);

    }


}