package com.pirai.swagger.hello.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SwaggerDemo {
	@Id
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
