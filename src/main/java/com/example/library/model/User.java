package com.example.library.model;

public class User {

    String userName;
    String userId;

    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String toString() {
        return "Username: " + this.userName + ", UserId: " + this.userId;
    }

}