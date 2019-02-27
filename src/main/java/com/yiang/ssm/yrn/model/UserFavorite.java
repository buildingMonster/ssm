package com.yiang.ssm.yrn.model;

public class UserFavorite {
    private Long fav_id;

    private String fav_user_id;

    private String fav_blog_id;

    private String fav_folder;

    private String fav_folder_far;

    private String fav_folder_name;

    public UserFavorite(Long fav_id, String fav_user_id, String fav_blog_id, String fav_folder, String fav_folder_far, String fav_folder_name) {
        this.fav_id = fav_id;
        this.fav_user_id = fav_user_id;
        this.fav_blog_id = fav_blog_id;
        this.fav_folder = fav_folder;
        this.fav_folder_far = fav_folder_far;
        this.fav_folder_name = fav_folder_name;
    }

    public UserFavorite() {
        super();
    }

    public Long getFav_id() {
        return fav_id;
    }

    public void setFav_id(Long fav_id) {
        this.fav_id = fav_id;
    }

    public String getFav_user_id() {
        return fav_user_id;
    }

    public void setFav_user_id(String fav_user_id) {
        this.fav_user_id = fav_user_id;
    }

    public String getFav_blog_id() {
        return fav_blog_id;
    }

    public void setFav_blog_id(String fav_blog_id) {
        this.fav_blog_id = fav_blog_id;
    }

    public String getFav_folder() {
        return fav_folder;
    }

    public void setFav_folder(String fav_folder) {
        this.fav_folder = fav_folder;
    }

    public String getFav_folder_far() {
        return fav_folder_far;
    }

    public void setFav_folder_far(String fav_folder_far) {
        this.fav_folder_far = fav_folder_far;
    }

    public String getFav_folder_name() {
        return fav_folder_name;
    }

    public void setFav_folder_name(String fav_folder_name) {
        this.fav_folder_name = fav_folder_name;
    }
}