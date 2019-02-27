package com.yiang.ssm.rms.student.service;

import com.yiang.ssm.basic.util.PageBean;
import com.yiang.ssm.rms.student.model.ssm_student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName IStudentService
 * @Description //TODO
 * @CreateDate 2019-02-15 10:02
 * @Version 1.0
 */
@Repository
public interface IStudentService {

    int deleteByPrimaryKey(String sid);

    int insert(ssm_student record);

    int insertSelective(ssm_student record);

    ssm_student selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(ssm_student record);

    int updateByPrimaryKey(ssm_student record);

    List<ssm_student> queryStudentPager(ssm_student student, PageBean pageBean);
}
