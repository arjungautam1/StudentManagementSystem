package com.texas.student.management.service.user;

import com.texas.student.management.model.user.CourseTeacher;
import com.texas.student.management.repository.student.CourseTeachingRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseTeacherServiceImpl implements CourseTeacherService {

    private CourseTeachingRepository courseTeachingRepository;
    @Autowired
    public CourseTeacherServiceImpl(CourseTeachingRepository courseTeachingRepository) {
        this.courseTeachingRepository = courseTeachingRepository;
    }

    @Override
    public List<CourseTeacher> getAllCourseTeacher() {
        return (List<CourseTeacher>) courseTeachingRepository.findAll();
    }

    @Override
    public Optional<CourseTeacher> getCourseTeacherById(Long id) {
        return courseTeachingRepository.findById(id);
    }

    @Override
    public void addCourseTeacherRecord(CourseTeacher courseTeacher) {
        courseTeachingRepository.save(courseTeacher);

    }

    @Override
    public void deleteCourseTeacherRecord(Long id) {
        courseTeachingRepository.deleteById(id);

    }

    @Override
    public void updateCourseTeacherRecord(Long id, CourseTeacher courseTeacher) {
        courseTeachingRepository.save(courseTeacher);

    }


}
