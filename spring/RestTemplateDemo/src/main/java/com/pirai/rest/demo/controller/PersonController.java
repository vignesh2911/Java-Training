package com.pirai.rest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pirai.rest.demo.entity.Person;
import com.pirai.rest.demo.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService service;
	
	@Cacheable(value = "AllpersonsCache", key = "#root.methodName")
	@GetMapping("/person")
	public List<Person> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/person/{id}")
	public Person getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	@PostMapping("/person/")
	public Person savePerson(@RequestBody Person person)
	{
		return service.savePerson(person);
	}
}
