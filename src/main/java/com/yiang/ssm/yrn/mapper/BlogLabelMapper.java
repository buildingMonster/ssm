package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.BlogLabel;

public interface BlogLabelMapper {
    int deleteByPrimaryKey(Long bl_id);

    int insert(BlogLabel record);

    int insertSelective(BlogLabel record);

    BlogLabel selectByPrimaryKey(Long bl_id);

    int updateByPrimaryKeySelective(BlogLabel record);

    int updateByPrimaryKey(BlogLabel record);
}