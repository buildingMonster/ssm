package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.Blog;

public interface BlogMapper {
    int deleteByPrimaryKey(String blog_id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(String blog_id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}