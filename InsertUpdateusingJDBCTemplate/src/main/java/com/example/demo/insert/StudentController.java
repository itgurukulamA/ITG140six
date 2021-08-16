package com.example.demo.insert;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		@PostMapping("/ghi")
		public Map<String,String> insert2(@RequestBody Student s) {
			return ss.insert2(s);
		}
		@PostMapping("/jkl")
		public String insert3(@RequestBody Student s) {
			return ss.insert3(s);
		}
		@GetMapping("/mno")
		public List select1() {
			return ss.select1();
		}
		@GetMapping("/pqr")
		public List select2(@RequestBody Student s) {
			return ss.select2(s.getId());
		}
		
		
		
		
		
		
	}

