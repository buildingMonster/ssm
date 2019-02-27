package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.UserConcern;

public interface UserConcernMapper {
    int deleteByPrimaryKey(Long conc_id);

    int insert(UserConcern record);

    int insertSelective(UserConcern record);

    UserConcern selectByPrimaryKey(Long conc_id);

    int updateByPrimaryKeySelective(UserConcern record);

    int updateByPrimaryKey(UserConcern record);
}