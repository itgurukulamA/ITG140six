package com.example.demo.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
 @Autowired
 EmployeeService es;
 @RequestMapping(value = "/add", method = RequestMethod.GET)
public Employee addEmployee(@RequestBody Employee em)
 {
  return es.createEmployee(em);
 }
}
