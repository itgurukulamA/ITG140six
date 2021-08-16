package com.example.demo.demo1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	@PostMapping("/insert")
	public String insert(@RequestBody Student s)
	{
		return ss.insert(s);
	}
	
	@PostMapping("/inserti")
	public Map<String,String> insertion (@RequestBody Student s)
	{
		return ss.insertion(s);
	}
	
	@PostMapping("/update")
	public Map<String,String> update(@RequestBody Student s)
	{
		return ss.update(s);
	}


}
