package com.xworkz.general.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
     String name;
     String email;
     int phoneNo;
     String religion;
     int age;
    int password;

    public RegisterDto() {
        System.out.println("We are in the Dto");
    }

    public RegisterDto(String name, String email, int phoneNo, String religion, int age, int password) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.religion = religion;
        this.age = age;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getReligion() {
        return religion;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", religion='" + religion + '\'' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }
}
