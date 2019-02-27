package com.yiang.ssm.yrn.model;

import java.util.Date;

public class Blog {
    private String blog_id;

    private String blog_title;

    private String blog_conten;

    private Long blog_create_id;

    private String blog_create_name;

    private String blog_create_image;

    private Date blog_create_time;

    private Long blog_pageview;

    private Long blog_plate_id;

    private Long blog_type_id;

    private Date blog_type_name;

    private Long blog_praise;

    private Long blog_comment;

    private Date blog_comment_time;

    private Integer blog_status;

    public Blog(String blog_id, String blog_title, String blog_conten, Long blog_create_id, String blog_create_name, String blog_create_image, Date blog_create_time, Long blog_pageview, Long blog_plate_id, Long blog_type_id, Date blog_type_name, Long blog_praise, Long blog_comment, Date blog_comment_time, Integer blog_status) {
        this.blog_id = blog_id;
        this.blog_title = blog_title;
        this.blog_conten = blog_conten;
        this.blog_create_id = blog_create_id;
        this.blog_create_name = blog_create_name;
        this.blog_create_image = blog_create_image;
        this.blog_create_time = blog_create_time;
        this.blog_pageview = blog_pageview;
        this.blog_plate_id = blog_plate_id;
        this.blog_type_id = blog_type_id;
        this.blog_type_name = blog_type_name;
        this.blog_praise = blog_praise;
        this.blog_comment = blog_comment;
        this.blog_comment_time = blog_comment_time;
        this.blog_status = blog_status;
    }

    public Blog() {
        super();
    }

    public String getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(String blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_conten() {
        return blog_conten;
    }

    public void setBlog_conten(String blog_conten) {
        this.blog_conten = blog_conten;
    }

    public Long getBlog_create_id() {
        return blog_create_id;
    }

    public void setBlog_create_id(Long blog_create_id) {
        this.blog_create_id = blog_create_id;
    }

    public String getBlog_create_name() {
        return blog_create_name;
    }

    public void setBlog_create_name(String blog_create_name) {
        this.blog_create_name = blog_create_name;
    }

    public String getBlog_create_image() {
        return blog_create_image;
    }

    public void setBlog_create_image(String blog_create_image) {
        this.blog_create_image = blog_create_image;
    }

    public Date getBlog_create_time() {
        return blog_create_time;
    }

    public void setBlog_create_time(Date blog_create_time) {
        this.blog_create_time = blog_create_time;
    }

    public Long getBlog_pageview() {
        return blog_pageview;
    }

    public void setBlog_pageview(Long blog_pageview) {
        this.blog_pageview = blog_pageview;
    }

    public Long getBlog_plate_id() {
        return blog_plate_id;
    }

    public void setBlog_plate_id(Long blog_plate_id) {
        this.blog_plate_id = blog_plate_id;
    }

    public Long getBlog_type_id() {
        return blog_type_id;
    }

    public void setBlog_type_id(Long blog_type_id) {
        this.blog_type_id = blog_type_id;
    }

    public Date getBlog_type_name() {
        return blog_type_name;
    }

    public void setBlog_type_name(Date blog_type_name) {
        this.blog_type_name = blog_type_name;
    }

    public Long getBlog_praise() {
        return blog_praise;
    }

    public void setBlog_praise(Long blog_praise) {
        this.blog_praise = blog_praise;
    }

    public Long getBlog_comment() {
        return blog_comment;
    }

    public void setBlog_comment(Long blog_comment) {
        this.blog_comment = blog_comment;
    }

    public Date getBlog_comment_time() {
        return blog_comment_time;
    }

    public void setBlog_comment_time(Date blog_comment_time) {
        this.blog_comment_time = blog_comment_time;
    }

    public Integer getBlog_status() {
        return blog_status;
    }

    public void setBlog_status(Integer blog_status) {
        this.blog_status = blog_status;
    }
}