package com.yiang.ssm.yrn.service.impl;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.yrn.mapper.BasDictMapper;
import com.yiang.ssm.yrn.model.BasDict;
import com.yiang.ssm.yrn.service.IBasDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 高冷
 * @create  2019-02-27 20:25
 */
@Service
public class BasDictServiceImpl implements IBasDictService {

    @Autowired
    private BasDictMapper basDictMapper;

    @Override
    public int deleteByPrimaryKey(Long dict_id) {
        return basDictMapper.deleteByPrimaryKey(dict_id);
    }

    @Override
    public int insert(BasDict record) {
        return basDictMapper.insert(record);
    }

    @Override
    public int insertSelective(BasDict record) {
        return basDictMapper.insertSelective(record);
    }

    @Override
    public BasDict selectByPrimaryKey(Long dict_id) {
        return basDictMapper.selectByPrimaryKey(dict_id);
    }

    @Override
    public int updateByPrimaryKeySelective(BasDict record) {
        return basDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BasDict record) {
        return basDictMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BasDict> queryBasDictPager(BasDict basDict, PageBean pageBean) {
        return basDictMapper.queryBasDict(basDict);
    }
}
