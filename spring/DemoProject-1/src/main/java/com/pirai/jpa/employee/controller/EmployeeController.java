package com.pirai.jpa.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pirai.jpa.employee.entity.Employee;
import com.pirai.jpa.employee.repo.EmployeeRepo;
import com.pirai.jpa.employee.service.IEmployeeService;

@Controller
public class EmployeeController 
{

	@Autowired
	IEmployeeService service;

	@GetMapping(value="emp")
	public String getEmployees(@RequestParam(defaultValue = "0") int pageIndex, ModelMap modelMap)
	{
		Page<Employee> page = service.findEmployee(pageIndex);
		List<Employee> empList = page.getContent();
		modelMap.addAttribute("employees",empList);
		modelMap.addAttribute("next",page.hasNext());
		modelMap.addAttribute("back",page.hasPrevious());
		modelMap.addAttribute("currentPage",page.getNumber());
		return "ShowEmployees";
	}
	
}
