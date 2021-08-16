package com.example.demo.insert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	JdbcTemplate jt;
	public String insert(Student s) {
		String sql = "insert into itg140 values(?,?,?,?,?)";
		int id = s.getId();
		String name=s.getName();
		int age=s.getAge();
		String email = s.getEmail();
		long phno=s.getPhno();
		int result=jt.update(sql,id,name,age,email,phno);
	    if (result>0) {
	    	return "Data inserted successfully";
	    }
	    else {
	    	return "Data not inserted successfully";
	    }
	}  
	    public String insert1(Student s) {
	    	String sql = "update itg140 set name=? where id=?";
	    	int id = s.getId();
			String name=s.getName();
			int result=jt.update(sql,name,id);
		    if (result>0) {
		    	return "Data inserted successfully";
		    }
		    else {
		    	return "Data not inserted successfully";
		    }
	    	
	    	
	    	
	    }
	}


