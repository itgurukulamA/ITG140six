package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public int insert (Student s)
	{
		int id=s.getId();
		String name=s.getName();
		int age=s.getAge();
		String email=s.getEmail();
		int phno=s.getPhno();
		String sql="insert into itg140 values(?,?,?,?,?)";
		int i=jdbcTemplate.update(sql,id,name,age,email,phno);
		return i;
	}
	public int update(Student s)
	{
		int id=s.getId();
		String name=s.getName();
		int age=s.getAge();
		String email=s.getEmail();
		int phno=s.getPhno();
		String sql="update itg140 set name=? where id=?";
		int x=jdbcTemplate.update(sql,name,id);
		return x;
	}
	

}
