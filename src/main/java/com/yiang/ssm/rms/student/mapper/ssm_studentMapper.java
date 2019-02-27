package com.yiang.ssm.rms.student.mapper;


import com.yiang.ssm.rms.student.model.ssm_student;

import java.util.List;

public interface ssm_studentMapper {

    int deleteByPrimaryKey(String sid);

    int insert(ssm_student record);

    int insertSelective(ssm_student record);

    ssm_student selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(ssm_student record);

    int updateByPrimaryKey(ssm_student record);

    List<ssm_student> queryStudentPager(ssm_student student);
}