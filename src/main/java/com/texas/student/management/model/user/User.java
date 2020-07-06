package com.texas.student.management.model.user;
import javax.persistence.*;



/*
*
*
*
*
* {

    "id":1,
    "fullName":"Ramesh Lekhek",
    "phoneNumber":"9841367709",
    "gender":"MALE",
    "bloodGroup":"O+ve",
    "status":"ACTIVE",
    "yearEnrolled":207545,
    "houseNumber":112416551,
    "userType":"STUDENT",
    "address":{
        "addressId":2
    },
    "userRegistration":{
        "id":1
    }
*
*
*
*
*
* */
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String fullName;
    private String imageUrl;
    private String phoneNumber;
    private long yearEnrolled;
    private long dateOfBirth;
    private Gender gender;
    private String bloodGroup;
    private Status status;
    private String historyId;
    /*
    * no need of type
    *
    * */
    private UserType userType;
    private String remarks;

    @OneToOne
    @JoinColumn(name = "address_id", unique = true)
    private Address address;


    @OneToOne
    @MapsId
    private UserRegistration userRegistration;

    public enum UserType
    {
        HOD,
        COORDINATOR,
        ADMINISTRATION,
        TEACHER,
        STUDENT,
        LIBRARIAN
    }

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public enum Status {
        ACTIVE, PASSIVE, LEFT
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(long yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserRegistration getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }
}







