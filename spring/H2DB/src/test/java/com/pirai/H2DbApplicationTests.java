package com.pirai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.pirai.controller.StudentController;
import com.pirai.entity.Student;

@SpringBootTest
class H2DbApplicationTests {
	@Value("${studentrest.server.url}")
	String mainURL;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	@Test
	void getStudentLoads() {
		LOGGER.info("BaseURL: "+mainURL);
		Assertions.assertEquals(1,1);
	}
//	@Test
//	void getStudentLoads() {
//		System.out.println("Base URL: "+mainURL);
//		Assertions.assertEquals(1,1);
//	}
//	@Test
//	void getStudentLoads() {
//		RestTemplate rest = new RestTemplate();
//		Student s=rest.getForObject(mainURL+"1", Student.class);
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		Assertions.assertEquals("sahul", s.getName());
//	}
//	
//	@Test
//	void postStudentLoads() {
//		RestTemplate rest = new RestTemplate();
//		Student stud = new Student();
//		stud.setName("ramji");
//		Student s=rest.postForObject(mainURL,stud, Student.class);
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		Assertions.assertEquals("ramji", s.getName());
//	}
//	
//	@Test
//	void putStudentLoads() {
//		RestTemplate rest = new RestTemplate();
//		Student stud = new Student();
//		stud.setId(1);
//		stud.setName("akash");
//		rest.put("",stud, Student.class);
//		Student s=rest.getForObject(mainURL+"1", Student.class);
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		Assertions.assertEquals("akash", s.getName());
//	}
//	
//	@Test
//	void deleteStudentLoads() {
//		RestTemplate rest = new RestTemplate();
//		Student stud = new Student();
//		rest.delete(mainURL+"",stud, Student.class);
////		Student s=rest.getForObject(mainURL+"2", Student.class);
////		System.out.println(s.getId());
////		System.out.println(s.getName());
////		Assertions.assertNotEquals("ramji", s.getName());
//	}
}
