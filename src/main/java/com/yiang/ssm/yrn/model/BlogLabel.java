package com.yiang.ssm.yrn.model;

public class BlogLabel {
    private Long bl_id;

    private Long bl_label_id;

    private String bl_blog_id;

    public BlogLabel(Long bl_id, Long bl_label_id, String bl_blog_id) {
        this.bl_id = bl_id;
        this.bl_label_id = bl_label_id;
        this.bl_blog_id = bl_blog_id;
    }

    public BlogLabel() {
        super();
    }

    public Long getBl_id() {
        return bl_id;
    }

    public void setBl_id(Long bl_id) {
        this.bl_id = bl_id;
    }

    public Long getBl_label_id() {
        return bl_label_id;
    }

    public void setBl_label_id(Long bl_label_id) {
        this.bl_label_id = bl_label_id;
    }

    public String getBl_blog_id() {
        return bl_blog_id;
    }

    public void setBl_blog_id(String bl_blog_id) {
        this.bl_blog_id = bl_blog_id;
    }
}