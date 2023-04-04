package com.pirai.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pirai.rest.entity.Employee;
import com.pirai.rest.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getByID(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Employee createEmp(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAll();
		
	}
	
}
