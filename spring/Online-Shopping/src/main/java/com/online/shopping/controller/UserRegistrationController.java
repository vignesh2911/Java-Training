package com.online.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.shopping.dto.UserRegistration;
import com.online.shopping.repo.UserRegistratonRepo;

@RestController
public class UserRegistrationController {
	@Autowired
	UserRegistratonRepo repo;
	
	@GetMapping("/user/")
	public List<UserRegistration> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/user/{id}")
	public UserRegistration getById(@PathVariable ("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping("/user/")
	public String post(@RequestBody UserRegistration user)
	{
		return repo.toString();
	}
//	@PostMapping("/dataSave")
//	public String saveData(@RequestBody UserRegistration userRegistration){
//		return userRegistration.toString();
//	}
}
