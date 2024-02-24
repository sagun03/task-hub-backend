package com.example.taskHub.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.taskHub.model.User;

import mapper.UserMapper;

@Repository
public class userRepositoryImpl {
	@Autowired
	@Qualifier(value="mysqlJdbcTemplate")
	JdbcTemplate jdbcTemplate ;
	
	public User getUser(){
		
		String query = "SELECT id,cust_name,cust_email FROM TaskHubBackend.user WHERE id = ?";
		User user = jdbcTemplate.queryForObject(query, new UserMapper(),1);
		return user;
	}
	

}
