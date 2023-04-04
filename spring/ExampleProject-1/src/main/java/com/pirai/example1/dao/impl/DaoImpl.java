package com.pirai.example1.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pirai.example1.dao.ItestDAO;
@Repository
public class DaoImpl implements ItestDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertRecord() {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into emp(name) values ('vignesh')");
	}

	@Override
	public List selectRecord() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from emp");
	}

}
