package com.anz.interview.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.anz.interview.dao.UserDao;
import com.anz.interview.domain.User;

/**
 * 功能概要：UserService实现类
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
		
	}

	public List<User> getAll() {
		return userDao.getAll();
	}

}
