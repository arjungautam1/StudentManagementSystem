package com.texas.student.management.service.course;

import com.texas.student.management.model.course.Course;
import com.texas.student.management.repository.course.CourseRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourse() {
        return IterableListConvertable.getListFromIterable( courseRepository.findAll());
    }

    @Override
    public Optional<Course> getUserById(String id) {
        return courseRepository.findById(id);
    }

    @Override
    public void addCourse(Course user) {
          courseRepository.save(user);
    }

    @Override
    public void deleteCourseById(String id) {
           courseRepository.deleteById(id);
    }

    @Override
    public void updateCourse(String id, Course user) {
          user.setCode(id);
          courseRepository.save(user);
    }
}
