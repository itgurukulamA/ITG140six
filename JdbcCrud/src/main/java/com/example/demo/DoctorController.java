package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@Autowired
	DoctorService ds;
	@PostMapping("/di")
	public String insertdata(@RequestBody Doctor d)
	{
		
			
		try {
			
		
		int i=ds.insert(d);
		if(i>0)
		{
			return"data Inserted";
			
		}
		else
		{
			return"data not inserted";
			
		}
		}
		catch(Exception e)
		{
			return"you are trying to insert duplicate values";
		}
		
		
	}

}
