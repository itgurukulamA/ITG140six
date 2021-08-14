package com.example.demo.Maths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {
	@Autowired OperationsService os;
	@PostMapping("/add")
	public int addition(@RequestBody Operations obj){
		return os.add(obj);
		
	}
	@GetMapping("/")
	public int message() {
		return 5;
	}
	

}
