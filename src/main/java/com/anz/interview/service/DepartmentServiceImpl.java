package com.anz.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.interview.dao.DepartmentDao;
import com.anz.interview.domain.Department;

/**
 * 功能概要：UserService实现类
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDao departmentDao;

	

	public List<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}

}
