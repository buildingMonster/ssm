package com.yiang.ssm.yrn.model;

public class UserHistory {
    private Long his_id;

    private String his_blog_id;

    private String his_viewer;

    public UserHistory(Long his_id, String his_blog_id, String his_viewer) {
        this.his_id = his_id;
        this.his_blog_id = his_blog_id;
        this.his_viewer = his_viewer;
    }

    public UserHistory() {
        super();
    }

    public Long getHis_id() {
        return his_id;
    }

    public void setHis_id(Long his_id) {
        this.his_id = his_id;
    }

    public String getHis_blog_id() {
        return his_blog_id;
    }

    public void setHis_blog_id(String his_blog_id) {
        this.his_blog_id = his_blog_id;
    }

    public String getHis_viewer() {
        return his_viewer;
    }

    public void setHis_viewer(String his_viewer) {
        this.his_viewer = his_viewer;
    }
}