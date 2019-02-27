package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.BasDict;

public interface BasDictMapper {
    int deleteByPrimaryKey(Long dict_id);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    BasDict selectByPrimaryKey(Long dict_id);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);
}