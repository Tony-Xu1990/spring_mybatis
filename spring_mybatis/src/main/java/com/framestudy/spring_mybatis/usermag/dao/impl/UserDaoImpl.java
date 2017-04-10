package com.framestudy.spring_mybatis.usermag.dao.impl;

import org.springframework.stereotype.Repository;

import com.framestudy.spring_mybatis.usermag.beans.UserInfo;
import com.framestudy.spring_mybatis.usermag.dao.IUserDao;
@Repository
public class UserDaoImpl implements IUserDao {

	public int saveUseInfo(UserInfo user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		return 0;
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserInfo getUserInfo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
