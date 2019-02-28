package com.yiang.ssm.rms.rmm.mapper;


import com.yiang.ssm.rms.rmm.model.SysRight;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface SysRightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(SysRight record);

    int insertSelective(SysRight record);

    SysRight selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(SysRight record);

    int updateByPrimaryKey(SysRight record);

    List<SysRight> listRightMenu(SysRight sysRight);

}