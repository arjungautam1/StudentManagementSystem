package com.texas.student.management.service.course;

import com.texas.student.management.model.course.AcademicCourse;
import com.texas.student.management.repository.course.AcademicCourseRepository;
import com.texas.student.management.service.course.AcademicCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicCourseServiceImpl implements AcademicCourseService {

    private AcademicCourseRepository academicCourseRepository;

    @Autowired
    public AcademicCourseServiceImpl(AcademicCourseRepository academicCourseRepository) {
        this.academicCourseRepository = academicCourseRepository;
    }

    @Override
    public List<AcademicCourse> getAll() {
        return (List<AcademicCourse>)academicCourseRepository.findAll();
    }

    @Override
    public void addAcademicCourse(AcademicCourse academicCourse) {
        academicCourseRepository.save(academicCourse);
    }

    @Override
    public Optional<AcademicCourse> getByCode(String code) {
        return academicCourseRepository.findById(code);
    }

    @Override
    public void deleteAcademicCourse(String code) {
        academicCourseRepository.deleteById(code);
    }

    @Override
    public void updateAcademicCourse(String code, AcademicCourse academicCourse) {
        academicCourseRepository.save(academicCourse);
    }


}
