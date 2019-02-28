package com.yiang.ssm.rms.rmm.controller;

import com.yiang.ssm.rms.rmm.model.SysRight;
import com.yiang.ssm.rms.rmm.service.SysRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Giraffe Wld
 * @site www.grf.com
 * @company grf公司
 * @create  2019-02-26 0:11
 */

@RequestMapping("/rms/rmm")
@Controller
public class SysRightController {

    @Autowired
    private SysRightService sysRightService;

    private void mapToRight(SysRight map, SysRight right) {
        System.out.println("我是一号");
        right.setId(map.getRightCode());
        right.setName(map.getRightText());
        right.setAttributes(map);

        List<SysRight> listMenu = this.sysRightService.listRightMenu(right);
        List<SysRight> rights = new ArrayList<SysRight>();
        this.listMapToListRight(listMenu, rights);
        right.setChildren(rights);
    }

    private void listMapToListRight(List<SysRight> list, List<SysRight> rights){
        System.out.println("我是二号");
        SysRight right = null;
        for (SysRight map : list) {
            right = new SysRight();
            this.mapToRight(map, right);
            rights.add(right);
        }
    }

    @RequestMapping("/rightJson")
    @ResponseBody
    public List<SysRight> fixMenuList(SysRight right) {
        System.out.println("我是三号");
        List<SysRight> listMenu = this.sysRightService.listRightMenu(right);
        List<SysRight> list = new ArrayList<SysRight>();
        this.listMapToListRight(listMenu, list);
        return list;
    }
}
