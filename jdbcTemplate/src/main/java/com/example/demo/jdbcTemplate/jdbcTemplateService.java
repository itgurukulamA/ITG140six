package com.example.demo.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service; 

@Service
public class jdbcTemplateService {
	@Autowired
	JdbcTemplate jt;
	
	
	public int insert(Jdbc j) { 
		
		int id=j.getId();
		String name=j.getName();
		int age=j.getAge();
		int regno=j.getRegno();
		String branch=j.getBranch();
		String a="insert into itg140 values(?,?,?,?,?)";
		return jt.update(a,id,name,age,regno,branch);
	}

}