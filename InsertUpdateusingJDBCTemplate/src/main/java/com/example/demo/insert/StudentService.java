package com.example.demo.insert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	JdbcTemplate jt;
	@Autowired
	NamedParameterJdbcTemplate npjt;
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
	    public Map<String,String> insert2(Student s){
	    	Map m = new HashMap();
	    	String sql="insert into itg140(id,name,age,email,phno) values(:id,:name,:age,:email,:phno)";
	    	SqlParameterSource sps = new MapSqlParameterSource()
	    			.addValue("id", s.getId())
	    			.addValue("name", s.getName())
	    			.addValue("age", s.getAge())
	    			.addValue("email",s.getEmail())
	    			.addValue("phno", s.getPhno());
	    			int result = npjt.update(sql, sps);
	    			if (result>0) {
	    		    	m.put("success","Data inserted successfully");
	    		    }
	    		    else {
	    		    	m.put("failure","Data not inserted successfully");
	    		    }
	    			return m;
	    	    	  }
	      public String insert3(Student s) {
	    	  String sql = "delete from itg140 where id=?";
	    	  int id = s.getId();
	    	  int result = jt.update(sql,id);
	    	  if (result>0) {
  		    	return "Record deleted successfully";
  		    }
  		    else {
  		    	return "sorry... Record deletion failed";
  		    }
	    	  
	      }
	      public List select1() {
	    	  Map<String,Object> map=null;
	    	  List list = new ArrayList();
	    	  List <Map<String,Object>> obj = new ArrayList<Map<String,Object>>();
	    	  String sql = "Select * from itg140";
	    	  obj=jt.queryForList(sql);
	    	  for(Map<String,Object>r1:obj) {
	    		 map  = new HashMap<String,Object>();
	    		 map.put("id", r1.get("id"));
	    		 map.put("name", r1.get("name"));
	    		 map.put("age", r1.get("age"));
	    		 map.put("email", r1.get("email"));
	    		 map.put("phno", r1.get("phno"));
	    		 list.add(map);
	    	  }
	    	  return list;
	      } 
	      public List select2(int id) {
	    	  Map<String,Object> map=null;
	    	  List list = new ArrayList();
	    	  List <Map<String,Object>> obj = new ArrayList<Map<String,Object>>();
	    	  String sql = "Select * from itg140 where id =?";
	    	  obj=jt.queryForList(sql,id);
	    	  for(Map<String,Object>r1:obj) {
	    		 map  = new HashMap<String,Object>();
	    		 map.put("id", r1.get("id"));
	    		 map.put("name", r1.get("name"));
	    		 map.put("age", r1.get("age"));
	    		 map.put("email", r1.get("email"));
	    		 map.put("phno", r1.get("phno"));
	    		 list.add(map);
	    	  }
	    	  return list;
	      } 

	      }


