package com.yiang.ssm.rms.rmr.service;

import com.yiang.ssm.rms.rmr.model.SysRole;

import java.util.List;

/**
 * @author hentai
 * @site www.hentai.com
 * @company hentai公司
 * @create  2019-02-27 15:40
 */
public interface SysRoleService {
    int deleteByPrimaryKey(Long role_id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long role_id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> listSysRole(SysRole sysRole);
}
