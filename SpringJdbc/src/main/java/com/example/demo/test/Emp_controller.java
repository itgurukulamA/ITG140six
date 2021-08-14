package com.example.demo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emp_controller {
	@Autowired
	Emp_service empservice;
	@PostMapping("/emp")
	public String addEmp(@RequestBody Emp emp) {
		return empservice.insertEmp(emp);
	}
	@PostMapping("/uemp")
	public String updateemp(@RequestBody Emp emp)
	{
		return empservice.updatemp(emp);
	}
	@PostMapping("/demp")
	public String deleteemp(@RequestBody Emp emp)
	{
		return empservice.deletemp(emp);
		
	}
	@PostMapping("/gemp")
	public List<Emp> getemp(@RequestBody Emp emp) {
		int id=emp.getId();
		return  empservice.getemployee(id);
	
	}
	@PostMapping("/gemps")
	public List<Emp> getemps(@RequestBody Emp emp){
		return empservice.getemployees();
	}
	@PostMapping("/search")
	public List<Emp> getsearch(@RequestBody Emp emp){
		return empservice.getsearch(emp);
	}

}
