package com.framestudy.spring_mybatis;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.framestudy.spring_mybatis.usermag.beans.UserInfo;
import com.framestudy.spring_mybatis.usermag.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)//在使用JUnit测试的时候，启动spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	@Resource
	private IUserService userInfoServiceImpl;
	
	@Test
	public void testSaveUserInfo(){
		userInfoServiceImpl.saveUseInfo(new UserInfo(100l,"xiaowang","1233",28));
	}
	
	
}
