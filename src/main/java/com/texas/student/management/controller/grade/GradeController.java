package com.texas.student.management.controller.grade;

import com.texas.student.management.exception.grade.RecordNotFoundException;
import com.texas.student.management.model.grade.Grade;
import com.texas.student.management.service.grade.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/grade")
public class GradeController {

    private GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Grade>> getAllGrade() {
        List<Grade> grade= gradeService.getAllGrade();
        if (grade.isEmpty()){
            throw new RecordNotFoundException("Record is not Found");
        }
        return new ResponseEntity<List<Grade>>(grade,HttpStatus.CREATED);

    }



    /*
    *
    * {
	"roomNumber":10,
        "stream":"BBS",
        "batch":2074,
        "semester":"I",
        "block":"10",
        "section": "A",
        "gradeType":"ACADEMICCOURSE"
}
    *
    *
    *
    * */

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> addGrade(@Valid @RequestBody Grade grade) {
        gradeService.addGrade(grade);
        return new ResponseEntity<String>("The data is created", HttpStatus.CREATED);

    }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteGradeId(@Valid @PathVariable(name = "id") Long id) {
       Optional<Grade>grade1 =gradeService.getGradeById(id);
       if (grade1.isPresent()){
           gradeService.deleteGradeById(id);
           return new ResponseEntity<String>("The data is deleted",HttpStatus.RESET_CONTENT);
       }
       throw new RecordNotFoundException("the data is not found");


    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Grade> getGradeById(@Valid @PathVariable(name = "id") Long id) {

        Optional<Grade> grade = gradeService.getGradeById(id);
        if (grade.isPresent()) {
            return new ResponseEntity<>(grade.get(), HttpStatus.FOUND);
        } else {

            throw new RecordNotFoundException("Invalid id" + id);
        }
    }

    @PutMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<String> updateGrade(@Valid @PathVariable("id") Long id, @Valid @RequestBody Grade grade) {
       Optional<Grade> grade1 =gradeService.getGradeById(id);
       if (grade1.isPresent()) {
           gradeService.updateGrade(id, grade);
           return new ResponseEntity<String>("The data is updated",HttpStatus.RESET_CONTENT);
       }
       throw new RecordNotFoundException("the given id in not in the database");
    }


}
