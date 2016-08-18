package com.anz.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anz.interview.common.Message;
import com.anz.interview.domain.Department;
import com.anz.interview.domain.DepartmentVO;
import com.anz.interview.service.DepartmentService;


@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/department", method = RequestMethod.GET)
	@ResponseBody
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	@ResponseBody
	public DepartmentVO getDepartmentAndEmployees(@PathVariable("id") Long id) {
		return departmentService.getDepartmentAndEmployees(id);
	}
	
	@RequestMapping(value = "/department", method = RequestMethod.PUT)
	@ResponseBody
	public Message updateDepartment(@RequestBody Department department) {
			int result=departmentService.updateByPrimaryKeySelective(department);
			if (result>0){
				return  new Message("0","修改成功！");
			}
			return new Message("1","修改失败！");
		
	}
	
	@RequestMapping(value = "/department", method = RequestMethod.POST)
	@ResponseBody
	public Message saveDepartment(@RequestBody Department department) {
			int result=departmentService.insert(department);
			if (result>0){
				return  new Message("0","新增成功！");
			}
			return new Message("1","新增失败！");
		
	}
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Message deleteDepartment(@PathVariable("id") Long id) {
		int result= departmentService.deleteByPrimaryKey(id);
		if(result>0){
			return  new Message("0","删除成功！");
		}
		return new Message("1","删除失败！");
	}
}
