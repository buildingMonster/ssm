package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.UserFans;

public interface UserFansMapper {
    int deleteByPrimaryKey(Long fans_id);

    int insert(UserFans record);

    int insertSelective(UserFans record);

    UserFans selectByPrimaryKey(Long fans_id);

    int updateByPrimaryKeySelective(UserFans record);

    int updateByPrimaryKey(UserFans record);
}