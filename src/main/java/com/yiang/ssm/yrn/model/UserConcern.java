package com.yiang.ssm.yrn.model;

public class UserConcern {
    private Long conc_id;

    private String conc_user_id;

    private String conc_by_user_id;

    public UserConcern(Long conc_id, String conc_user_id, String conc_by_user_id) {
        this.conc_id = conc_id;
        this.conc_user_id = conc_user_id;
        this.conc_by_user_id = conc_by_user_id;
    }

    public UserConcern() {
        super();
    }

    public Long getConc_id() {
        return conc_id;
    }

    public void setConc_id(Long conc_id) {
        this.conc_id = conc_id;
    }

    public String getConc_user_id() {
        return conc_user_id;
    }

    public void setConc_user_id(String conc_user_id) {
        this.conc_user_id = conc_user_id;
    }

    public String getConc_by_user_id() {
        return conc_by_user_id;
    }

    public void setConc_by_user_id(String conc_by_user_id) {
        this.conc_by_user_id = conc_by_user_id;
    }
}