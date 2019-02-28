package com.yiang.ssm.rms.rmu.service.impl;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.rms.rmu.mapper.SysUserMapper;
import com.yiang.ssm.rms.rmu.model.SysUser;
import com.yiang.ssm.rms.rmu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hentai
 * @site www.hentai.com
 * @company hentai公司
 * @create  2019-02-27 11:40
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public int deleteByPrimaryKey(Long user_id) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Long user_id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }

    @Override
    public List<SysUser> listSysUserPager(SysUser sysUser, PageBean pageBean) {
        return this.sysUserMapper.listSysUser(sysUser);
    }
}
