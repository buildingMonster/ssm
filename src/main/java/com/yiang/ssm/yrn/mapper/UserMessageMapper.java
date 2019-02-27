package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.UserMessage;

public interface UserMessageMapper {
    int deleteByPrimaryKey(Long mes_id);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(Long mes_id);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}