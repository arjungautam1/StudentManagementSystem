package com.texas.student.management.model.grade;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/*
*
*
*
*
* {

    "batch":2020,
    "roomNumber":5,
    "stream":"BSCCSIT",
    "semester":"I",
    "block":"A",
    "section":"A",
    "gradeType":"ACADEMICCOURSE"
}
*
*
* */
@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /*
    * I think room number must be in string as room number sometimes includes floor too
    *
    * */
   @Column(name = "roomNumber",nullable = false)
   @NotNull(message = "room number")
   @Range(min = 1)
    private int roomNumber;

    @Valid
    @NotNull(message = "stream")
    private Stream stream;

    @Column(name = "batch",nullable = false)
    @NotNull(message = "batch")
    @Range(min = 1)
    private int batch;

    @Valid
    @NotNull(message = "semester")
    private Semester semester;

    @NotBlank(message = "block")
    private String block;

    @NotBlank(message = "Section")
    private String section;
//
//    @Valid
//    @NotNull(message = "grade type")
//    private GradeType gradeType;
//    /*
//    * cr
//    * cordinator
//    *
//    *
//    * */
//
//    public enum GradeType {
//        ACADEMICCOURSE,
//        TRAININGCOURSE,
//        PROFESSIONALCOURSE
//    }
    public enum Stream {
        BSCCSIT,
        BBS,
        BCA,
        BBM,
        BA,
        BSW,
        MBS
    }
    public enum Semester{
        I,II,III,IV,V,VI,VII,VIII
    }


//    getter and setter
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

//    public GradeType getGradeType() {
//        return gradeType;
//    }
//
//    public void setGradeType(GradeType gradeType) {
//        this.gradeType = gradeType;
//    }
}
