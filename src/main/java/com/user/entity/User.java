package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private long userId;
    private String userName;
    private String userPhone;

    List<Contact> userContacts = new ArrayList<Contact>();

    public User(long userId, String userName, String userPhone, List<Contact> userContacts) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userContacts = userContacts;
    }

    public User(long userId, String userName, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
    }

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<Contact> getUserContacts() {
        return userContacts;
    }

    public void setUserContacts(List<Contact> userContacts) {
        this.userContacts = userContacts;
    }
}
