package com.yiang.ssm.basic.util;

/**
 * @Author 何卓（Lip·Gallager）
 * @Company yiang公司
 * @ClassName QueryUtil
 * @Description //TODO
 * @CreateDate 2019-01-28 19:03
 * @Version 1.0
 */
public class QueryUtil {

	private QueryUtil() {
		// 私有构造方法，工具类。
	};

	/**
	 * 给模糊查询追加%%符号
	 * 在给对象赋值时使用该方法
	 * @param value
	 * @return java.lang.String
	 * @CreateDate 19:10 2019/1/28
	 */
	public static String append(String value) {
		return "%" + value + "%";
	}

}
