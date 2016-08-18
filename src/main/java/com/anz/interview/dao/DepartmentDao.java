package com.anz.interview.dao;

import java.util.List;

import com.anz.interview.domain.Department;
import com.anz.interview.domain.DepartmentVO;

public interface DepartmentDao {
  
    int deleteByPrimaryKey(Long id);

    int insert(Department record);
    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    List<Department> getAllDepartments();
    
    DepartmentVO   getDepartmentAndEmployees(Long id);
}