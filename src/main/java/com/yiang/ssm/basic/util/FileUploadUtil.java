package com.yiang.ssm.basic.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName FileUploadUtil
 * @Description //TODO
 * @CreateDate 2019-02-15 11:51
 * @Version 1.0
 */
public class FileUploadUtil {

    /**
     * 指定文件上传位置
     */
    private static String path = "C://1-SSM-UPLOAD/";


    /**
     * 通用的建造方法
     *
     * @param file
     * @throws IOException
     */
    public static final void uploadFile(MultipartFile file) throws IOException {
        FileUtils.copyInputStreamToFile(file.getInputStream(),
                new File(path + file.getOriginalFilename()));
    }
}
