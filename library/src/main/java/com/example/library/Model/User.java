package com.example.library.Model;

import java.sql.Timestamp;

public class User {
    // 開頭須小寫
    private Integer id;
    private String phone;
    private String password;
    private String userName;
    private Timestamp regist_time;
    private Timestamp exit_time;

    // getter && setter
    // id
    public Integer getId() {
        return  id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    // phone
    public String getPhone() {
        return  phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    // password
    public String getPassword() {
        return  password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // userName
    public String getUserName() {
        return  userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    // regist_time
    public Timestamp getRegistTime() {
        return  regist_time;
    }
    public void setRegistTime(Timestamp regist_time) {
        this.regist_time = regist_time;
    }    
    // exit_time
    public Timestamp getExitTime() {
        return  exit_time;
    }
    public void setExitTime(Timestamp exit_time) {
        this.exit_time = exit_time;
    }
}
