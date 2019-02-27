package com.yiang.ssm.yrn.model;

import java.util.Date;

public class User {
    private String user_id;

    private String user_name;

    private String user_password;

    private Integer user_flag;

    private String user_email;

    private String user_phone;

    private String user_sex;

    private Date user_register_date;

    private String user_qq;

    private Date user_lastlogin_date;

    private String user_lastlogin_ip;

    private String user_signature;

    private String user_image;

    private String user_birthdaty;

    private String user_address;

    private String user_profession;

    private String user_school;

    public User(String user_id, String user_name, String user_password, Integer user_flag, String user_email, String user_phone, String user_sex, Date user_register_date, String user_qq, Date user_lastlogin_date, String user_lastlogin_ip, String user_signature, String user_image, String user_birthdaty, String user_address, String user_profession, String user_school) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_flag = user_flag;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_sex = user_sex;
        this.user_register_date = user_register_date;
        this.user_qq = user_qq;
        this.user_lastlogin_date = user_lastlogin_date;
        this.user_lastlogin_ip = user_lastlogin_ip;
        this.user_signature = user_signature;
        this.user_image = user_image;
        this.user_birthdaty = user_birthdaty;
        this.user_address = user_address;
        this.user_profession = user_profession;
        this.user_school = user_school;
    }

    public User() {
        super();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_flag() {
        return user_flag;
    }

    public void setUser_flag(Integer user_flag) {
        this.user_flag = user_flag;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public Date getUser_register_date() {
        return user_register_date;
    }

    public void setUser_register_date(Date user_register_date) {
        this.user_register_date = user_register_date;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public Date getUser_lastlogin_date() {
        return user_lastlogin_date;
    }

    public void setUser_lastlogin_date(Date user_lastlogin_date) {
        this.user_lastlogin_date = user_lastlogin_date;
    }

    public String getUser_lastlogin_ip() {
        return user_lastlogin_ip;
    }

    public void setUser_lastlogin_ip(String user_lastlogin_ip) {
        this.user_lastlogin_ip = user_lastlogin_ip;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_birthdaty() {
        return user_birthdaty;
    }

    public void setUser_birthdaty(String user_birthdaty) {
        this.user_birthdaty = user_birthdaty;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_profession() {
        return user_profession;
    }

    public void setUser_profession(String user_profession) {
        this.user_profession = user_profession;
    }

    public String getUser_school() {
        return user_school;
    }

    public void setUser_school(String user_school) {
        this.user_school = user_school;
    }
}