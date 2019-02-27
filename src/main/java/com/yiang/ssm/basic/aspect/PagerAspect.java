package com.yiang.ssm.basic.aspect;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiang.ssm.basic.util.PageBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName PagerAspect
 * @Description //TODO
 * @CreateDate 2019-01-16 19:07
 * @Version 1.0
 */
@Component //组件
@Aspect
public class PagerAspect {

    /**
     * @MethodName invoke  切面
     * @Description //TODO 切面针对于以下类的方法做处理
     * 1、返回类型不限
     * 2、任意包下
     * 3、以Service的接口
     * 4、以pager结尾的方法
     * 5、传入的参数不限
     * invoke方法内内容，是调用*Pager方法环绕通知所执行的内容
     * @CreateDate 19:09 2019/1/16
     * @Params [args]
     * @Return java.lang.Object
     **/
    @Around("execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable {
        //获取方法的参数
        Object[] params = args.getArgs();
        //如果过滤后方法的参数中含有PageBean，则说明需要分页
        PageBean pageBean = null;
        for (Object param : params) {
            if (param instanceof PageBean) {
                pageBean = (PageBean) param;
                break;
            }
        }
        if (pageBean != null && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        //-----调用前------
        //连接点，通过反射进行方法本身调用
        Object proceed = args.proceed(params);
        //-----调用后------
        if (pageBean != null && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo((List) proceed);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return proceed;
    }
}
