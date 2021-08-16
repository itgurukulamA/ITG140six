package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service 
public class DoctorService {
	@Autowired
	JdbcTemplate jt;
	public int insert(Doctor d)
	{
		System.out.println("hello");
		int id=d.getId();
		String name=d.getName();
		int workexp=d.getWorkexp();
		int age=d.getAge();
		String sql="insert into doctors values(?,?,?,?)";
		System.out.println(id+name+workexp+age);
		return jt.update(sql,id,name,workexp,age);
	}

}
