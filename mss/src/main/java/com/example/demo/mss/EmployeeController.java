package com.example.demo.mss;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController
{
 @Autowired
 EmployeeService es;
 @PostMapping("/create")
 public void create()
 {
	 es.createtable();
 }
 @GetMapping("/getpage/{page}/{size}")
 public List pagination(@PathVariable int page,@PathVariable int size)
 {
	 return es.pageselect(page,size);
 }
 @PostMapping("/insert")
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

  @PostMapping("/namedinsert")
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
  @GetMapping("/restapi")
  public String resttemplateapi()
  {
	  RestTemplate rest=new RestTemplate();
	  return rest.getForObject("https://reqres.in/api/users?page=2",String.class);
  }
  @GetMapping("/selectall")
  public List selection()
  {
  return es.selectall(); 
  }
  @GetMapping("/selectone")
  public List selection1(@RequestBody Employee emp)
  {
 return es.selectone(emp.getId());
  }
  @GetMapping("/selectsome")
  public List selection2(@RequestBody Employee emp)
  {
 return es.selectsome(emp.getId(),emp.getName());
  }
  @GetMapping("/selectspecified")
  public List selection3(@RequestBody Employee emp)
  {
 return es.selectspecified();
  }
 
}