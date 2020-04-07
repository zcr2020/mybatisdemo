package com.chap61.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatisUtils�����࣬���ڻ��SqlSession
 * @author Administrator
 *
 */
public class MyBatisUtils {
	static SqlSessionFactory  sqlSessionFactory;
	static{
		try {
			Reader  inputStream=Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * �õ�SqlSession
	 * @return
	 */
	public static SqlSession  getSession(){
		return sqlSessionFactory.openSession();
	}
}
