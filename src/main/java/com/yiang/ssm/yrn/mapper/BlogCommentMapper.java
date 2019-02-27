package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.BlogComment;

public interface BlogCommentMapper {
    int deleteByPrimaryKey(Long com_id);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    BlogComment selectByPrimaryKey(Long com_id);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);
}