package com.pirai.rest.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirai.rest.demo.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
