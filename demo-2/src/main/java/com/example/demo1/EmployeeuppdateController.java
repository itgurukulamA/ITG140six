package com.example.demo1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeuppdateController {
	@Autowired
	EmployeeupdateService eus;
	
	@PostMapping("/update")
	public Map<String,String> update(@RequestBody Employeeupdate eu)
	{
	return eus.Updateemploy(eu);
	}

}