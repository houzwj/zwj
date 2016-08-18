package com.anz.interview.service;

import java.util.List;

import com.anz.interview.common.Message;
import com.anz.interview.domain.Department;
import com.anz.interview.domain.DepartmentVO;
import com.anz.interview.domain.User;

/**
 * 
 */
public interface DepartmentService {
	
	List<Department> getAllDepartments();
	DepartmentVO getDepartmentAndEmployees(Long id);
	Department selectByPrimaryKey(Long id);
	int updateByPrimaryKeySelective(Department department);
	int deleteByPrimaryKey(Long id);
	int insert(Department department);
}
