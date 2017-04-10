package com.framestudy.spring_mybatis.usermag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.framestudy.spring_mybatis.usermag.beans.UserInfo;
import com.framestudy.spring_mybatis.usermag.dao.IUserDao;
import com.framestudy.spring_mybatis.usermag.service.IUserService;
@Service
public class UserInfoServiceImpl implements IUserService {
	@Resource
	private IUserDao userDaoImpl;
	public int saveUseInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUseInfo(user);
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserInfo(user);
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfo(id);
	}

	public UserInfo getUserInfo(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfo(id);
	}

}
