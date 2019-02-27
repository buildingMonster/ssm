package com.yiang.ssm.yrn.mapper;

import com.yiang.ssm.yrn.model.UserFavorite;

public interface UserFavoriteMapper {
    int deleteByPrimaryKey(Long fav_id);

    int insert(UserFavorite record);

    int insertSelective(UserFavorite record);

    UserFavorite selectByPrimaryKey(Long fav_id);

    int updateByPrimaryKeySelective(UserFavorite record);

    int updateByPrimaryKey(UserFavorite record);
}