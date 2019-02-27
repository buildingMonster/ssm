package com.yiang.ssm.yrn.model;

import java.util.Date;

public class BlogPlate {
    private Long pla_id;

    private String pla_name;

    private String pla_todo;

    private Date pla_create_date;

    private Integer pla_enabled;

    public BlogPlate(Long pla_id, String pla_name, String pla_todo, Date pla_create_date, Integer pla_enabled) {
        this.pla_id = pla_id;
        this.pla_name = pla_name;
        this.pla_todo = pla_todo;
        this.pla_create_date = pla_create_date;
        this.pla_enabled = pla_enabled;
    }

    public BlogPlate() {
        super();
    }

    public Long getPla_id() {
        return pla_id;
    }

    public void setPla_id(Long pla_id) {
        this.pla_id = pla_id;
    }

    public String getPla_name() {
        return pla_name;
    }

    public void setPla_name(String pla_name) {
        this.pla_name = pla_name;
    }

    public String getPla_todo() {
        return pla_todo;
    }

    public void setPla_todo(String pla_todo) {
        this.pla_todo = pla_todo;
    }

    public Date getPla_create_date() {
        return pla_create_date;
    }

    public void setPla_create_date(Date pla_create_date) {
        this.pla_create_date = pla_create_date;
    }

    public Integer getPla_enabled() {
        return pla_enabled;
    }

    public void setPla_enabled(Integer pla_enabled) {
        this.pla_enabled = pla_enabled;
    }
}