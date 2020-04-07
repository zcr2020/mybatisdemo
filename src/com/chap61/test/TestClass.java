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
		System.out.println("�������û�����");
		String loginId=inputScanner.next();
		System.out.println("���������룺");
		String loginPwd=inputScanner.next();
		if(userDAO.doLogin(loginId, loginPwd)){
			System.out.println("�û���¼�ɹ���");
		}
		else{
			System.out.println("�û���¼ʧ�ܣ�");
		}
	}
}
