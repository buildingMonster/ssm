package com.yiang.ssm.yrn.controller;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.yrn.model.BasDict;
import com.yiang.ssm.yrn.service.IBasDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 高冷
 * @create  2019-02-27 20:35
 * 基础数据表的controller层
 */
@Controller
public class BasDictController {

    @Autowired
    private IBasDictService iBasDictService;

    /**
     * index博客分类的字典表查询
     * @param request
     * @param basDict
     * @return
     */
    @ResponseBody
    @RequestMapping("/queryBasdictPager")
    public List<BasDict> queryBasDictPager(HttpServletRequest request, BasDict basDict){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        pageBean.setRows(9);
        List<BasDict> basDictList = iBasDictService.queryBasDictPager(basDict, pageBean);
        return basDictList;
    }

}
