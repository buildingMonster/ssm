package com.yiang.ssm.rms.student.service.impl;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.rms.student.mapper.ssm_studentMapper;
import com.yiang.ssm.rms.student.model.ssm_student;
import com.yiang.ssm.rms.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName IStudentServiceImpl
 * @Description //TODO
 * @CreateDate 2019-02-15 10:02
 * @Version 1.0
 */
@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private ssm_studentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(String sid) {
        return studentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(ssm_student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int insertSelective(ssm_student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public ssm_student selectByPrimaryKey(String sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(ssm_student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int updateByPrimaryKey(ssm_student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public List<ssm_student> queryStudentPager(ssm_student student, PageBean pageBean) {
        return studentMapper.queryStudentPager(student);
    }
}
