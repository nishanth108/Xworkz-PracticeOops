package com.xworkz.chatapp.dto;

import java.io.Serializable;

public class HomeDto implements Serializable {
    private String userName;
    private String userEmail;
    private int phone;
    private String userAddress;
    private String userAddhar;
    private String collegeName;
    private String relationshipStatus;
    private int userSalary;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setUserAddhar(String userAddhar) {
        this.userAddhar = userAddhar;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserSalary(int userSalary) {
        this.userSalary = userSalary;
    }

    public String getUserName() {
        return userName;
    }

    public int getPhone() {
        return phone;
    }

    public String getUserAddhar() {
        return userAddhar;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public int getUserSalary() {
        return userSalary;
    }

}

