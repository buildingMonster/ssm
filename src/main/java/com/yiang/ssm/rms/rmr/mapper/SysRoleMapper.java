package com.yiang.ssm.rms.rmr.mapper;

import com.yiang.ssm.rms.rmr.model.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long role_id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long role_id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> listSysRole(SysRole sysRole);
}