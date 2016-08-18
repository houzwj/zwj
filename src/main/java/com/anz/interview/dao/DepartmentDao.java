package com.anz.interview.dao;

import com.anz.interview.domain.Department;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentDao {
  
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);


    Department selectByPrimaryKey(Long id);

   
    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    List<Department> getAllDepartments();
}