package com.yiang.ssm.rms.rmr.model;

public class SysRole {
    private Long role_id;

    private String role_name;

    private String role_desc;

    private Integer role_flag;

    public SysRole(Long role_id, String role_name, String role_desc, Integer role_flag) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.role_desc = role_desc;
        this.role_flag = role_flag;
    }

    public SysRole() {
        super();
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }

    public Integer getRole_flag() {
        return role_flag;
    }

    public void setRole_flag(Integer role_flag) {
        this.role_flag = role_flag;
    }
}