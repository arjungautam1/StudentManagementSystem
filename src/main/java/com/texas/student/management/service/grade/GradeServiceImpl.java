package com.texas.student.management.service.grade;

import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.repository.grade.GradeRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService{

    private GradeRepository gradeRepository;
    @Autowired
    public GradeServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }


    @Override
    public List<Grade> getAllGrade() {
        return (List<Grade>) gradeRepository.findAll();
    }

    @Override
    public void addGrade(Grade grade) {
        gradeRepository.save(grade);
    }

    @Override
    public void deleteGradeById(Long id) {

        gradeRepository.deleteById(id);
    }

    @Override
    public Optional<Grade> getGradeById(Long id) {
        return gradeRepository.findById(id);
    }

    @Override
    public void updateGrade(Long id, Grade grade) {
        grade.setId(id);
        gradeRepository.save(grade);
    }


}
