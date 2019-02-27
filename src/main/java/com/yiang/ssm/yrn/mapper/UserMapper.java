package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}