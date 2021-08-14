package com.example.demo.example;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicApi {
	List l=new ArrayList();
	@PostMapping("/add")
	public List addElements(@RequestParam String a) {
		l.add(a);
		return l;
	}
	
	@GetMapping("/")
	
	public List GetallElements() {
		return l;
	}

}
