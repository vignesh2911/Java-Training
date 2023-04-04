package com.pirai.swagger.hello.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirai.swagger.hello.entity.SwaggerDemo;

public interface SwaggerDemoRepo extends JpaRepository<SwaggerDemo, String> {

}
