package com.juaracoding.fajavafundamental.percobaan.OOP;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/5/2023 8:14 PM
@Last Modified 7/5/2023 8:14 PM
Version 1.0
*/

public class Register {

    private String userId;
    private String password;
    private String image;

    public Register() {
    }

    public Register(String userId, String password, String image) {
        this.userId = userId;
        this.password = password;
        this.image = image;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    //    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getUserId() {
//        return userId;
//    }
//    public String getPassword() {
//        return password;
//    }


}

