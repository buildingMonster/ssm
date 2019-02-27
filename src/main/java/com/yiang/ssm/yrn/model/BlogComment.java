package com.yiang.ssm.yrn.model;

import java.util.Date;

public class BlogComment {
    private Long com_id;

    private Long com_user_id;

    private Date com_date;

    private String com_text;

    private String com_type;

    private String com_blog_id;

    private Integer com_status;

    private Long com_by_id;

    public BlogComment(Long com_id, Long com_user_id, Date com_date, String com_text, String com_type, String com_blog_id, Integer com_status, Long com_by_id) {
        this.com_id = com_id;
        this.com_user_id = com_user_id;
        this.com_date = com_date;
        this.com_text = com_text;
        this.com_type = com_type;
        this.com_blog_id = com_blog_id;
        this.com_status = com_status;
        this.com_by_id = com_by_id;
    }

    public BlogComment() {
        super();
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

    public Long getCom_user_id() {
        return com_user_id;
    }

    public void setCom_user_id(Long com_user_id) {
        this.com_user_id = com_user_id;
    }

    public Date getCom_date() {
        return com_date;
    }

    public void setCom_date(Date com_date) {
        this.com_date = com_date;
    }

    public String getCom_text() {
        return com_text;
    }

    public void setCom_text(String com_text) {
        this.com_text = com_text;
    }

    public String getCom_type() {
        return com_type;
    }

    public void setCom_type(String com_type) {
        this.com_type = com_type;
    }

    public String getCom_blog_id() {
        return com_blog_id;
    }

    public void setCom_blog_id(String com_blog_id) {
        this.com_blog_id = com_blog_id;
    }

    public Integer getCom_status() {
        return com_status;
    }

    public void setCom_status(Integer com_status) {
        this.com_status = com_status;
    }

    public Long getCom_by_id() {
        return com_by_id;
    }

    public void setCom_by_id(Long com_by_id) {
        this.com_by_id = com_by_id;
    }
}