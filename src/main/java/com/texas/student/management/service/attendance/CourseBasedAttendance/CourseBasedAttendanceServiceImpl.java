package com.texas.student.management.service.attendance.CourseBasedAttendance;
import com.texas.student.management.model.attendence.CourseBasedAttendance;
import com.texas.student.management.repository.attendance.CourseBasedAttendanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseBasedAttendanceServiceImpl implements CourseBasedAttendanceService {

    private CourseBasedAttendanceRepository courseBasedAttendanceRepository;
    @Autowired
    public CourseBasedAttendanceServiceImpl(CourseBasedAttendanceRepository courseBasedAttendanceRepository) {
        this.courseBasedAttendanceRepository = courseBasedAttendanceRepository;
    }


    @Override
    public List<CourseBasedAttendance> getAllCourseBasedAttendance() {
        return (List<CourseBasedAttendance>) courseBasedAttendanceRepository.findAll();
    }

    @Override
    public void addCourseBasedAttendance(CourseBasedAttendance courseBasedAttendance) {
        courseBasedAttendanceRepository.save(courseBasedAttendance);
    }

    @Override
    public void deleteCourseBasedAttendanceById(Long id) {
        courseBasedAttendanceRepository.deleteById(id);
    }

    @Override
    public Optional<CourseBasedAttendance> getCourseBasedAttendanceById(Long id) {
        return courseBasedAttendanceRepository.findById(id);
    }



    @Override
    public void updateCourseBasedAttendance(Long id, CourseBasedAttendance courseBasedAttendance) {
        courseBasedAttendanceRepository.save(courseBasedAttendance);

    }


}