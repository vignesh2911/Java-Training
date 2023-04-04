package com.pirai.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirai.rest.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
