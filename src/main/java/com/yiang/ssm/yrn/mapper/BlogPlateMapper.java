package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.BlogPlate;

public interface BlogPlateMapper {
    int deleteByPrimaryKey(Long pla_id);

    int insert(BlogPlate record);

    int insertSelective(BlogPlate record);

    BlogPlate selectByPrimaryKey(Long pla_id);

    int updateByPrimaryKeySelective(BlogPlate record);

    int updateByPrimaryKey(BlogPlate record);
}