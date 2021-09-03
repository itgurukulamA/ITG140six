package com.example.demo.Aspect;

import org.springframework.stereotype.Service;

@Service
	public class EmployeeService {
	public Employee createEmployee(Employee e)
	{
	System.out.println("Hello");
	return e;
	}
	}
