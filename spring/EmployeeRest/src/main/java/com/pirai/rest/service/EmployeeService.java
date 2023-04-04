package com.pirai.rest.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.pirai.rest.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public Employee getByID(int emp_id);
	public Employee createEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	public void deleteEmp(int emp_id);
	public void deleteAll();
} 
