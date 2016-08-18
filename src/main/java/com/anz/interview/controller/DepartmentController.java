package com.anz.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anz.interview.domain.Department;
import com.anz.interview.service.DepartmentService;

/**
 *
 */
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	  
	@RequestMapping(value="/departments",method=RequestMethod.GET)
	@ResponseBody
	public List<Department>  getAll(){
		return departmentService.getAllDepartments();
	}
}
