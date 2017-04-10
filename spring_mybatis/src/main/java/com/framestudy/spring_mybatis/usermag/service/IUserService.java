package com.framestudy.spring_mybatis.usermag.service;

import com.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserService {
	
	public int saveUseInfo(UserInfo user);
	
	public int updateUserInfo(UserInfo user);
	
	public int deleteUserInfo(Long id);
	
	public UserInfo getUserInfo(Long id);
	
}
