package com.yiang.ssm.rms.rmu.model;


import com.yiang.ssm.rms.rmr.model.SysRole;

public class SysUser {
    private Long user_id;

    private String user_name;

    private String user_password;

    private Long user_role_id;

    private Integer user_flag;

    private SysRole sysRole;

    public SysUser(Long user_id, String user_name, String user_password, Long user_role_id, Integer user_flag, SysRole sysRole) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_role_id = user_role_id;
        this.user_flag = user_flag;
        this.sysRole = sysRole;
    }


    public SysUser() {
        super();
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
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

    public Long getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Long user_role_id) {
        this.user_role_id = user_role_id;
    }

    public Integer getUser_flag() {
        return user_flag;
    }

    public void setUser_flag(Integer user_flag) {
        this.user_flag = user_flag;
    }
    public SysRole getSysRole(){return sysRole;}

    public void setSysRole(SysRole sysRole){this.sysRole = sysRole;}

}