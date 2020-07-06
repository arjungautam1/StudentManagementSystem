package com.texas.student.management.service.course;

import com.texas.student.management.model.course.TrainingAndProfessionalCourse;
import com.texas.student.management.repository.course.TrainingAndProfessionalCourseRepository;
import com.texas.student.management.service.course.TrainingAndProfessionalCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingAndProfessionalCourseServiceImpl implements TrainingAndProfessionalCourseService {

    private TrainingAndProfessionalCourseRepository trainingAndProfessionalCourseRepository;
    @Autowired
    public TrainingAndProfessionalCourseServiceImpl(TrainingAndProfessionalCourseRepository trainingAndProfessionalCourseRepository) {
        this.trainingAndProfessionalCourseRepository = trainingAndProfessionalCourseRepository;
    }

    @Override
    public List<TrainingAndProfessionalCourse> getAll() {
        return (List<TrainingAndProfessionalCourse>) trainingAndProfessionalCourseRepository.findAll();
    }

    @Override
    public void addCourse(TrainingAndProfessionalCourse trainingAndProfessionalCourse) {
        trainingAndProfessionalCourseRepository.save(trainingAndProfessionalCourse);
    }

    @Override
    public Optional<TrainingAndProfessionalCourse> getByCode(String code) {
        return trainingAndProfessionalCourseRepository.findById(code);
    }

    @Override
    public void deleteCourse(String code) {
        trainingAndProfessionalCourseRepository.deleteById(code);
    }

    @Override
    public void updateCourse(String code, TrainingAndProfessionalCourse trainingAndProfessionalCourse) {
        trainingAndProfessionalCourseRepository.save(trainingAndProfessionalCourse);
    }


}
