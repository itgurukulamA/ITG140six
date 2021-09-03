package com.example.demo.mss;


import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService
{
 @Autowired
 JdbcTemplate jt;
 @Autowired
 NamedParameterJdbcTemplate namedjdbc;
 
 public  static Logger log=LoggerFactory.getLogger(EmployeeService.class);
public void createtable()
{
	String sql="create table Ramesh (id integer,name varchar(40))";
	jt.execute(sql);
}
public List pageselect(int page,int size)
{
   String sql ="select * from mss limit ";
   int i =(page-1) * size;
   sql=sql+i+","+ size;
   Map<String,Object> map=null;
   List list=new ArrayList();
   List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
   obj=jt.queryForList(sql);
   for(Map<String,Object> r1:obj)
   {
   map=new HashMap<String,Object>();
   map.put("id",r1.get("id"));
   map.put("name",r1.get("name"));
   map.put("age",r1.get("age"));
   map.put("phno",r1.get("phno"));
   map.put("email",r1.get("email"));
   map.put("desig",r1.get("desig"));
   map.put("salary",r1.get("salary"));
   list.add(map);
   }
   return list;
}
 public int insert(Employee emp)
 {
   String sql = "insert into mss values(?,?,?,?,?,?,?)";
   int id = emp.getId();
   String name = emp.getName();
   int age = emp.getAge();
   int phno = emp.getPhno();
   String email = emp.getEmail();
   String desig = emp.getDesig();
   int salary=emp.getSalary();
   return jt.update(sql, id, name, age, phno, email, desig, salary);
}

public Map<String, String> insertparameters(Employee emp)
{
 Map<String, String> m = new HashMap<String, String>();
 int result = 0;
 try  
 {
  String sql = "insert into mss(id,name,age,phno,email,desig,salary) values(:id,:name,:age,:phno,:email,:desig,:salary)";
   SqlParameterSource parameters = new MapSqlParameterSource().addValue("id", emp.getId())
    .addValue("name", emp.getName())
    .addValue("age",emp.getAge())
    .addValue("phno",emp.getPhno())
    .addValue("email",emp.getEmail())
    .addValue("desig", emp.getDesig())
    .addValue("salary",emp.getSalary());
     result = namedjdbc.update(sql, parameters);
     if (result > 0)
     {
      log.info("success");
      m.put("Success", "Data inserted successfully");
     }
     else
     {
      log.info("Fail");
      m.put("failed", "Data insertion failed");
     }
  }
   catch (Exception e)
  {
     m.put("Error", "Error occured try again");
  }
 return m;
}

  public int myupdate(Employee emp)
  {
   String sql = "update mss set name =? where id = ? ";
   String name = emp.getName();
   int id = emp.getId();
    return jt.update(sql, name, id);
  }
  public int mydelete(Employee emp)
  {
 String sql="delete from mss where id=?";
 int id=emp.getId();
 int result=jt.update(sql,id);
 return result;
  }
  public List selectall()
  {
 Map<String,Object> map=null;
 List list=new ArrayList();
 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
 String sql= "select * from mss";
 obj=jt.queryForList(sql);
 for(Map<String,Object> r1:obj)
 {
 map=new HashMap<String,Object>();
 map.put("id",r1.get("id"));
 map.put("name",r1.get("name"));
 map.put("age",r1.get("age"));
 map.put("phno",r1.get("phno"));
 map.put("email",r1.get("email"));
 map.put("desig",r1.get("desig"));
 map.put("salary",r1.get("salary"));
 list.add(map);
 }
 return list;
   }
  public List selectone(int id)
  {
 Map<String,Object> map=null;
 List list=new ArrayList();
 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
 String sql= "select * from mss where id=?";
 obj=jt.queryForList(sql,id);
 for(Map<String,Object> r1:obj)
 {
 map=new HashMap<String,Object>();
 map.put("id",r1.get("id"));
 map.put("name",r1.get("name"));
 map.put("age",r1.get("age"));
 map.put("phno",r1.get("phno"));
 map.put("email",r1.get("email"));
 map.put("desig",r1.get("desig"));
 map.put("salary",r1.get("salary"));
 list.add(map);
 }
 return list;
  }
  public List selectsome(int id, String name)
  {

 Map<String,Object> map=null;
 List list=new ArrayList();
 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
 String sql= "select * from mss where id=? and name=? ";
 obj=jt.queryForList(sql,id,name);
 for(Map<String,Object> r1:obj)
 {
 map=new HashMap<String,Object>();
 map.put("id",r1.get("id"));
 map.put("name",r1.get("name"));
 map.put("age",r1.get("age"));
 map.put("phno",r1.get("phno"));
 map.put("email",r1.get("email"));
 map.put("desig",r1.get("desig"));
 map.put("salary",r1.get("salary"));
 list.add(map);
 }
 return list;
  }
  public List selectspecified()
  {

 Map<String,Object> map=null;
 List list=new ArrayList();
 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
 String sql= "select id,name,salary from mss";
 obj=jt.queryForList(sql);
 for(Map<String,Object> r1:obj)
 {
 map=new HashMap<String,Object>();
 map.put("id",r1.get("id"));
 map.put("name",r1.get("name"));
 map.put("salary",r1.get("salary"));
 list.add(map);
 }
 return list;
  }
}