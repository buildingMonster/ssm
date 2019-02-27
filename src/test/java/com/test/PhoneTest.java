package com.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * @author 高冷
 * @create  2019-02-23 12:00
 *
 * 手机号码归属地查询的测试
 */
public class PhoneTest {


    public static void main(String[] args) {
        String phone="15274689025";
        MobileCodeWS mobileCodeWS=new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap1=mobileCodeWS.getMobileCodeWSSoap();
        String mobileCodeInfo = mobileCodeWSSoap1.getMobileCodeInfo(phone, null);
        System.out.println("svn的maven"+mobileCodeInfo);
    }
}
