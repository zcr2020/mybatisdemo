package com.chap61.dao;
/**
 * UserDAO接口提供了用户登录验证的方法
 * @author Administrator
 *
 */
public interface UserDAO {
	/**
	 * 登录验证方法
	 * @param loginId：用户名
	 * @param loginPwd ：密码
	 * @return true:登录成功   false：登录失败
	 */
	public boolean doLogin(String loginId,String loginPwd);

}
