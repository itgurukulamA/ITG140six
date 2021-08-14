package com.example.demo.ArithmeticOpusingSpbwebServices;

import org.springframework.stereotype.Service;

@Service
public class TestService { 
  
	public int addition(Test test)
	{ 
		return test.getParam1()+test.getParam2();
		
	}
    public int Subtraction(Test test)
    {
    	return test.getParam1()-test.getParam2();
    }
    public int multiplication(Test test)
	{ 
		return test.getParam1()*test.getParam2();
		
	}
    public int division(Test test)
    {
    	return test.getParam1()/test.getParam2();
    }
}
