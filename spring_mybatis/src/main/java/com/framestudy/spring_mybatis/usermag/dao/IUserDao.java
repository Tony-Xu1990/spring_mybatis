package com.framestudy.spring_mybatis.usermag.dao;

import com.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserDao {
	
	
	public int saveUseInfo(UserInfo user);
	
	public int updateUserInfo(UserInfo user);
	
	public int deleteUserInfo(Long id);
	
	public UserInfo getUserInfo(Long id);
	
}
