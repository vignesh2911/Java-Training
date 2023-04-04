package com.pirai.rest.demo.service;

import java.util.List;

import com.pirai.rest.demo.entity.Person;

public interface PersonService {
	public List<Person> getAll();
	public Person getById(int id);
	public Person savePerson(Person person);
}
