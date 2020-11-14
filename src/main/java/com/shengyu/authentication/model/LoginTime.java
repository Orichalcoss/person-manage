package com.shengyu.authentication.model;

import java.util.Date;

public class LoginTime {
    int id;
    Date time;

    public LoginTime() {
    }

    public LoginTime(int id, Date time) {
        this.id = id;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
