package com.yiang.ssm.yrn.service;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.yrn.model.BasDict;

import java.util.List;

/**
 * @author 高冷
 * @create  2019-02-27 19:41
 * 基础数据表的接口层
 */
public interface IBasDictService {


    int deleteByPrimaryKey(Long dict_id);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    BasDict selectByPrimaryKey(Long dict_id);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);


    /**
     * index.html界面的博客分类功能，
     * 此功能是查询基础数据表中表中的博客分类
     *
     */

    List<BasDict> queryBasDictPager(BasDict basDict, PageBean pageBean);


}
