package com.pirai.jpa.employee.service;

import org.springframework.data.domain.Page;

import com.pirai.jpa.employee.entity.Employee;

public interface IEmployeeService {
	Page<Employee> findEmployee(int pageIndex);
}
