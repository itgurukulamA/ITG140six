package com.example.demo.DatabaseConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService { 
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public int insert(Student s) 
	{
		int id=s.getId();
		String name=s.getName();
		String email=s.getEmail();
		String phno=s.getPhoneNo(); 
		String sql="insert into itg140 values(?,?,?,?)"; 
		int i=jdbcTemplate.update(sql,id,name,email,phno);
		return i;
	} 
	
	public int findNor() {
		String sql="select count(*) from itg140";
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}

}
