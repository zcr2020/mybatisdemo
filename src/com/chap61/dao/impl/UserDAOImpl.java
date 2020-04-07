package com.chap61.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.chap61.dao.UserDAO;
import com.chap61.domain.Users;
import com.chap61.util.MyBatisUtils;
@Repository("userDao")
public class UserDAOImpl implements UserDAO {
	SqlSession  sqlSession=MyBatisUtils.getSession();
	@Override
	public boolean doLogin(String loginId, String loginPwd) {
		Users users=new Users();
		users.setLoginId(loginId);
		users.setLoginPwd(loginPwd);
		int row=sqlSession.selectOne("com.chap61.mapper.UsersMapper.doLogin",users);
	//	System.out.println(user);
		return row>0?true:false;
	}

}
