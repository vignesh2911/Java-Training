package com.pirai.jpa.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pirai.jpa.employee.entity.Employee;
import com.pirai.jpa.employee.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public Page<Employee> findEmployee(int pageIndex) {
		// TODO Auto-generated method stub
		Pageable pageable =PageRequest.of(pageIndex,3,Sort.by("salary"));
		return repo.findAll(pageable);
	}

}
