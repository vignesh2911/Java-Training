package com.pirai.rest.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pirai.rest.demo.entity.Person;
import com.pirai.rest.demo.repo.PersonRepo;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonRepo repo;
//	@Cacheable(value = "AllemployeesCache", key = "#root.methodName")
	@Override
	public List<Person> getAll() {
		return repo.findAll();
	}

	@Override
	public Person getById(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Person savePerson(Person person) {
		return repo.save(person);
	}

	

}
