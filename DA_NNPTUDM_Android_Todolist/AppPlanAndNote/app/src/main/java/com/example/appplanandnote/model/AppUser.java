package com.example.appplanandnote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AppUser {
    @SerializedName("userID")
    private int userID;

    @SerializedName("fullname")
    private String fullname;

    @SerializedName("email")
    private String email;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("sex")
    private String sex;

    @SerializedName("username")
    private String username;

    @SerializedName("userPassword")
    private String userPassword;

    @SerializedName("userStatus")
    private int userStatus;

    @SerializedName("role")
    private String role;

    // Hàm khởi tạo
    public AppUser(String username, String userPassword, String fullname, String email,
                   String phoneNumber, String sex, int userStatus, String role) {
        this.username = username;
        this.userPassword = userPassword;
        this.fullname = fullname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.userStatus = userStatus;
        this.role = role;
    }

    // Phương thức GET, SET
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }
}
