package com.anz.interview.dao;

import com.anz.interview.domain.Employee;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDao {
  
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    int insertSelective(Employee record);

  
    Employee selectByPrimaryKey(Long id);

  
    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}