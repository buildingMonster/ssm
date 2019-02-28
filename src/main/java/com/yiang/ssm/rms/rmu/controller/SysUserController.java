package com.yiang.ssm.rms.rmu.controller;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.basic.util.QueryUtil;
import com.yiang.ssm.basic.util.StringUtils;
import com.yiang.ssm.rms.rmu.model.SysUser;
import com.yiang.ssm.rms.rmu.service.SysUserService;
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
 * @create  2019-02-27 11:43
 */
@Controller
@RequestMapping("/rms/rmu")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/listSysUser")
    @ResponseBody
    public Map<String,Object> listSysUserPager(HttpServletRequest request, SysUser sysUser){
        PageBean pageBean = new PageBean();
        if (StringUtils.isNotBlank(sysUser.getUser_name())) {
            sysUser.setUser_name(QueryUtil.append(sysUser.getUser_name()));
        }
        pageBean.setRequest(request);
        List<SysUser> sysUserList = this.sysUserService.listSysUserPager(sysUser,pageBean);
        Map<String,Object> map = new HashMap<>();
        map.put("data",sysUserList);
        map.put("count",pageBean.getTotal());
        map.put("code",0);
        return map;
    }

}
