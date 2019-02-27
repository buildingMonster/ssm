package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.UserHistory;

public interface UserHistoryMapper {
    int deleteByPrimaryKey(Long his_id);

    int insert(UserHistory record);

    int insertSelective(UserHistory record);

    UserHistory selectByPrimaryKey(Long his_id);

    int updateByPrimaryKeySelective(UserHistory record);

    int updateByPrimaryKey(UserHistory record);
}