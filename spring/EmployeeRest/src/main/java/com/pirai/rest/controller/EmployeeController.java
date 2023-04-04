package com.pirai.rest.controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pirai.rest.entity.Employee;
import com.pirai.rest.service.EmployeeService;
import com.pirai.rest.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee/")
	public List<Employee> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/employee/{emp_id}")
	public Employee getByID(@PathVariable ("emp_id") int emp_id) {
		// TODO Auto-generated method stub
		return service.getByID(emp_id);
	}
	
	@PostMapping("/employee/")
	public Employee createEmp(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return service.createEmp(employee);
	}
	
	@PutMapping("/employee/")
	public Employee updateEmp(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return service.updateEmp(employee);
	}
	
	@DeleteMapping("/employee/{emp_id}")
	public void deleteEmp(@PathVariable ("emp_id") int emp_id) {
		// TODO Auto-generated method stub
		service.deleteEmp(emp_id);
	}
	
	@DeleteMapping("/employee/")
	public void deleteAll() {
		// TODO Auto-generated method stub
		service.deleteAll();
		
	}
}
