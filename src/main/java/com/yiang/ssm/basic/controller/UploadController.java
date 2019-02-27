package com.yiang.ssm.basic.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName UploadController
 * @Description //TODO 通用上传文件控制层
 * @CreateDate 2019-02-13 16:52
 * @Version 1.0
 */
@Controller
public class UploadController {

	@RequestMapping("/upload")
	public String upload(HttpServletRequest request, MultipartFile file) {
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(),
					new File("H://1-SSM-UOLOAD/" + file.getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "a";
	}
}
