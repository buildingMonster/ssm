package com.yiang.ssm.rms.student.model;

import lombok.Data;

@Data
public class ssm_student {

    private String sid;

    private String sname;

    private String sex;

    private String stu_image_id;

    public ssm_student() {

    }

    public ssm_student(String sid, String sname, String sex, String stu_image_id) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.stu_image_id = stu_image_id;
    }
}