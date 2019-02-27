package com.yiang.ssm.yrn.model;

public class UserFans {
    private Long fans_id;

    private String fans_user_id;

    private String fans_by_user_id;

    public UserFans(Long fans_id, String fans_user_id, String fans_by_user_id) {
        this.fans_id = fans_id;
        this.fans_user_id = fans_user_id;
        this.fans_by_user_id = fans_by_user_id;
    }

    public UserFans() {
        super();
    }

    public Long getFans_id() {
        return fans_id;
    }

    public void setFans_id(Long fans_id) {
        this.fans_id = fans_id;
    }

    public String getFans_user_id() {
        return fans_user_id;
    }

    public void setFans_user_id(String fans_user_id) {
        this.fans_user_id = fans_user_id;
    }

    public String getFans_by_user_id() {
        return fans_by_user_id;
    }

    public void setFans_by_user_id(String fans_by_user_id) {
        this.fans_by_user_id = fans_by_user_id;
    }
}