package com.pirai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pirai.entity.Student;
import com.pirai.repo.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/student/")
	public List <Student> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable("id") int id){
		return repo.findById(id).get();
	}
	
	@PostMapping("/student/")
	public Student save(@RequestBody Student stud){
		return repo.save(stud);
	}
	
	@PutMapping("/student/")
	public Student update(@RequestBody Student stud){
		return repo.save(stud);
	}
	
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable("id") int id){
		repo.deleteById(id);
		return "Deleted id: "+id;
	}
	
	@DeleteMapping("/student/")
	public String deleteAll()
	{
		repo.deleteAll();
		return "Deleted Successfully";
	}
}
