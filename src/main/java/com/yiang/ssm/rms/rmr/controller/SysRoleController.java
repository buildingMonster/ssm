package com.yiang.ssm.rms.rmr.controller;

import com.yiang.ssm.basic.util.QueryUtil;
import com.yiang.ssm.basic.util.StringUtils;
import com.yiang.ssm.rms.rmr.model.SysRole;
import com.yiang.ssm.rms.rmr.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hentai
 * @site www.hentai.com
 * @company hentai公司
 * @create  2019-02-27 15:48
 */
@Controller
@RequestMapping("/rms/rmr")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
    @ResponseBody
    @RequestMapping("/listSysRole")
    public Map<String,Object> listSysRole(HttpServletRequest request, SysRole sysRole){
        if (StringUtils.isNotBlank(sysRole.getRole_name())){
            sysRole.setRole_name(QueryUtil.append(sysRole.getRole_name()));
        }
        List<SysRole> sysRoleList = this.sysRoleService.listSysRole(sysRole);
        Map<String,Object> map = new HashMap<>();
        map.put("data",sysRoleList);
        return map;
    }

}
