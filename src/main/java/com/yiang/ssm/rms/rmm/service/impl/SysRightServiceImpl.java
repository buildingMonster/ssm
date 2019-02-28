package com.yiang.ssm.rms.rmm.service.impl;

import com.yiang.ssm.rms.rmm.mapper.SysRightMapper;
import com.yiang.ssm.rms.rmm.model.SysRight;
import com.yiang.ssm.rms.rmm.service.SysRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Giraffe Wld
 * @site www.grf.com
 * @company grf公司
 * @create  2019-02-26 0:15
 */
@Service
public class SysRightServiceImpl implements SysRightService {
    @Autowired
    private SysRightMapper sysRightMapper;

    @Override
    public List<SysRight> listRightMenu(SysRight sysRight) {
        return this.sysRightMapper.listRightMenu(sysRight);
    }
}
