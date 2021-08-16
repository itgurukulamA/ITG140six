package com.example.demo.employee;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
 @Autowired
 EmployeeService es;
 @PostMapping("/insertion")
 public String insert(@RequestBody Employee emp) 
 {
  int i = es.insert(emp);
  if (i > 0) 
  {
    return "Data inserted successfully";
  }
  else 
  { 
    return "Data insertion failed";
  }
 }

  @PostMapping("/namedinsertion")
  public Map<String, String> insertparameters(@RequestBody Employee emp)
  {
   Map<String, String> i = es.insertparameters(emp);
   return (i);
  }
  
  @PostMapping("/updation")
  public int myupdate(@RequestBody Employee emp)
  {
   int i=es.myupdate(emp);
   return i;
  }
  @PostMapping("/deletion")
  public String mydeletion(@RequestBody Employee emp)
  {
	  int i=es.mydelete(emp);
	  if(i>0)
	  {
		  return "deleted";
	  }
	  else
	  {
		  return "deletion failed";
	  }
  }
  @GetMapping("/selectall")
  public List selection()
  {
	  return es.selectall();
  }
  @GetMapping("/selectsome")
  public List selectsome(@RequestBody Employee emp)
  {
	  return es.selectsome(emp.getId());
  }
}