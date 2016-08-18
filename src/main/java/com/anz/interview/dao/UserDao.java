package com.anz.interview.dao;


import java.util.List;

import com.anz.interview.domain.User;

/**
 * 功能概要：User的DAO类
 * 
 * @author linbingwen
 * @since 2015年9月28日
 */
public interface UserDao {
	/**
	 * 
	 * @author linbingwen
	 * @since 2015年9月28日
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);
	
	
	public List<User> getAll();

}
