package com.anz.interview.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.anz.interview.baseTest.SpringTestCase;
import com.anz.interview.domain.User;
import com.anz.interview.service.UserService;


public class UserServiceTest extends SpringTestCase	{
	@Resource
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(10);
        logger.debug("用户" + user);
	}
	

}
