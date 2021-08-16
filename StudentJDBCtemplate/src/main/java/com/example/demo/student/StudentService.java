package com.example.demo.student;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
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
		//int id=s.getId();
		//String name=s.getName();
		//int age=s.getAge();
		//String email=s.getEmail();
		//int phno=s.getPhno();
		String sql="update itg140 set name=? where id=?";
		int x=jdbcTemplate.update(sql,s.getName(),s.getId());
		return x;
	}
	@Autowired
	NamedParameterJdbcTemplate njdbc;
	public Map insert1(Student s)
	
	{
		Map m=new HashMap();
		String sql="insert into itg140 (id,name,age,email,phno) values(:id,:name,:age,:email,:phno)";
		SqlParameterSource sps=new MapSqlParameterSource()
			.addValue("id", s.getId())
			.addValue("name", s.getName())
			.addValue("age", s.getAge())
			.addValue("email", s.getEmail())
			.addValue("phno", s.getPhno());
		int a=njdbc.update(sql,sps);
		if(a>0)
		{
			m.put("success","data set succesfully");
		}
		else
		{
			m.put("fail","data not set succesfully");
		}
		
			
		return m;
		
	}
	

}
