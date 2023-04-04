package com.pirai.example1.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pirai.example1.dao.ItestDAO;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	ItestDAO itestDAO;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		itestDAO.insertRecord();
		List list = itestDAO.selectRecord();
		list.forEach(string -> System.out.println(string));
	}

}
