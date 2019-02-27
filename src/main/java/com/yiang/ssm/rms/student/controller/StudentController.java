package com.yiang.ssm.rms.student.controller;

import com.yiang.ssm.basic.util.FileUploadUtil;
import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.basic.util.QueryUtil;
import com.yiang.ssm.basic.util.StringUtils;
import com.yiang.ssm.rms.student.model.ssm_student;
import com.yiang.ssm.rms.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName StudentController
 * @Description //TODO
 * @CreateDate 2019-02-15 9:58
 * @Version 1.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request, ssm_student student) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        String sname = student.getSname();
        if (StringUtils.isNotBlank(sname)) {
            student.setSname(QueryUtil.append(sname));
        }
        List<ssm_student> ssm_students = studentService.queryStudentPager(student,pageBean);
        System.out.println(ssm_students);
        request.setAttribute("studentList", ssm_students);
        request.setAttribute("pageBean", pageBean);
        return "studentList";
    }

    @RequestMapping("/add")
    @Transactional
    public String add(MultipartFile file, ssm_student student) {
        try {
            FileUploadUtil.uploadFile(file);
            student.setStu_image_id(file.getOriginalFilename());
            this.studentService.insertSelective(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/student/list";
    }

    @RequestMapping("/delete/{sid}")
    public String del(@PathVariable(value = "sid") String sid) {
        this.studentService.deleteByPrimaryKey(sid);
        return "redirect:/student/list";
    }

    @RequestMapping("/update")
    @Transactional
    public String update(MultipartFile file,ssm_student student) {
        try {
            FileUploadUtil.uploadFile(file);
            student.setStu_image_id(file.getOriginalFilename());
            this.studentService.updateByPrimaryKeySelective(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/student/list";
    }

    @RequestMapping("/findOne")
    public String findOne(HttpServletRequest request, String sid) {
        ssm_student student = this.studentService.selectByPrimaryKey(sid);
        request.setAttribute("student", student);
        return "studentAdd";
    }
}
