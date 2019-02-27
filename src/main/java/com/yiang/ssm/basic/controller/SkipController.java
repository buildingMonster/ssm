package com.yiang.ssm.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName SkipController
 * @Description //TODO 处理页面跳转的通用类
 * @CreateDate 2019-01-28 19:45
 * @Version 1.0
 */
@Controller
@RequestMapping("/skip")
public class SkipController {

    /**
     * 控制页面的通用跳转
     * @param pageUrl 跳转路径
     * @return 跳转到指定路径的页面
     */
	@RequestMapping("/pageUrl")
	public String pageUrl(String pageUrl) {
		return pageUrl;
	}
}
