package com.example.demo.ArithmeticOpusingSpbwebServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	  @Autowired
	  TestService ts; 
	  @RequestMapping("/")
	  public int add()
	  {
		  return 20+10;
	  } 
	  @RequestMapping("/display") 
	  public String DisplayString()
	  {
		  return "Hello Rajesh";
	  }
      @PostMapping("/add")
      public int addition1(@RequestBody Test test) 
      {
    	  return ts.addition(test);
      } 
      @PostMapping("/sub") 
      public int subtraction1(@RequestBody Test test) 
      {
    	  return ts.Subtraction(test);
      }
      @PostMapping("/mul")
      public int multiplication1(@RequestBody Test test) 
      {
    	  return ts.multiplication(test);
      } 
      @PostMapping("/div") 
      public int division1(@RequestBody Test test) 
      {
    	  return ts.division(test);
      } 
      @RequestMapping("/add1")  
  	public int Addition2(int a,int b) 
  	{
  		return a+b;
  	}
}
