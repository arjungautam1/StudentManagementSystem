package com.texas.student.management.model.user;

import javax.persistence.*;

/*
*
* This approach is named as shared primary key
*
*
* where userId is shared in address table i.e
*                2 users cannot have a same address
*                       if siblings or cousin have same address there will be duplicate row.....
*
*
*
* For solving these navitage to Student->Guardian
*
*
*
* */


/*
*
*
*
* {
    "province":"Karnali",
    "district":"Dolpa",
    "city":"Musikot",
    "streetName":"Rampe Dulal",
    "tole":"Ghojanre marg",
    "wardNumber":35,
    "houseNumber":112
}
*
*
* */


@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "aId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String province;
    private String district;
    private String city;//opt
    private String streetName;//opt
    private String tole;//opt
    private int wardNumber;
    private int houseNumber;//opt

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTole() {
        return tole;
    }

    public void setTole(String tole) {
        this.tole = tole;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
