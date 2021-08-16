
package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService obj;
	@PostMapping("/insert")
	public String insertData(@RequestBody Student s)
	{
		int j=obj.insert(s);
		if(j>0)
		{
			return "Data is Inserted Succesfully";
		}
		else
		{
			return "Data is not Inserted Succesfully";
		}
	
	}
	@PostMapping("/update")
	public String updateData(@RequestBody Student s)
	{
	int y=obj.update(s);
	if(y>0)
	{
		return "Data is inserted Succesfully";
	}
	else
	{
		return "Data is  not inserted Sucesfully";
	}
	}
}
