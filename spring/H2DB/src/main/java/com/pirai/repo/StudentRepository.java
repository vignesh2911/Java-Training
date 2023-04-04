package com.pirai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirai.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
