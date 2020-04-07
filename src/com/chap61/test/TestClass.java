package com.chap61.test;

import java.util.Scanner;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chap61.dao.UserDAO;

public class TestClass {
	@Test
	public void test(){
		ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO  userDAO=(UserDAO) context.getBean("userDao");
		Scanner  inputScanner=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String loginId=inputScanner.next();
		System.out.println("请输入密码：");
		String loginPwd=inputScanner.next();
		if(userDAO.doLogin(loginId, loginPwd)){
			System.out.println("用户登录成功！");
		}
		else{
			System.out.println("用户登录失败！");
		}
	}
}
