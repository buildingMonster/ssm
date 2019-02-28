package com.yiang.ssm.rms.rmr.service.impl;

import com.yiang.ssm.rms.rmr.mapper.SysRoleMapper;
import com.yiang.ssm.rms.rmr.model.SysRole;
import com.yiang.ssm.rms.rmr.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hentai
 * @site www.hentai.com
 * @company hentai公司
 * @create  2019-02-27 15:45
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public int deleteByPrimaryKey(Long role_id) {
        return this.sysRoleMapper.deleteByPrimaryKey(role_id);
    }

    @Override
    public int insert(SysRole record) {
        return this.sysRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRole record) {
        return this.insertSelective(record);
    }

    @Override
    public SysRole selectByPrimaryKey(Long role_id) {
        return this.selectByPrimaryKey(role_id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return this.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return this.sysRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysRole> listSysRole(SysRole sysRole) {
        return this.sysRoleMapper.listSysRole(sysRole);
    }
}
