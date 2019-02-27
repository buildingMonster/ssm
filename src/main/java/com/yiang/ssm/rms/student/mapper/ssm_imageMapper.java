package com.yiang.ssm.rms.student.mapper;


import com.yiang.ssm.rms.student.model.ssm_image;

public interface ssm_imageMapper {

    int deleteByPrimaryKey(String image_id);

    int insert(ssm_image record);

    int insertSelective(ssm_image record);

    ssm_image selectByPrimaryKey(String image_id);

    int updateByPrimaryKeySelective(ssm_image record);

    int updateByPrimaryKey(ssm_image record);
}