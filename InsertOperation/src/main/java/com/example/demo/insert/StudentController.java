package com.example.demo.insert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired 
	StudentService ss;
	@PostMapping("/abc")
	public String insert(@RequestBody Student s) {
		return ss.insert(s);
	}
	@PostMapping("/def")
		public String insert1(@RequestBody Student s) {
			return ss.insert1(s);
		}
		
	}

