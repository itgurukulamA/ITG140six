package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployService es;

	@PostMapping("/data")
	public Map<String, String> Insertion(@RequestBody Employs e) {
		return es.insertItems(e);

	}
}
