package com.yiang.ssm.rms.rmu.service;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.rms.rmu.model.SysUser;

import java.util.List;

/**
 * @author hentai
 * @site www.hentai.com
 * @company hentai公司
 * @create  2019-02-27 11:38
 */
public interface SysUserService {
    int deleteByPrimaryKey(Long user_id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long user_id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> listSysUserPager(SysUser sysUser, PageBean pageBean);
}
