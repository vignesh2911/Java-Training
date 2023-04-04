package com.pirai.swagger.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pirai.swagger.hello.entity.SwaggerDemo;
import com.pirai.swagger.hello.repo.SwaggerDemoRepo;

import io.swagger.annotations.ApiOperation;

@RestController
public class SwaggerDemoController {
	@Autowired
	SwaggerDemoRepo repo;
	@ApiOperation("The discription for displaying a string in swagger")
	@GetMapping("/hello")
	public String display()
	{
		return "Hello Swagger UI";
	}
	@PostMapping("/hello")
	public SwaggerDemo post(@RequestBody SwaggerDemo swagger)
	{
		return repo.save(swagger);
	}
}
