package com.example.demo.Arthematic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArthamaticController { 
	@Autowired 
	ArthamaticService as;  
	
	@GetMapping("/") 
	public int someValue()
	{
		return 20;
	}
	
	@PostMapping("/add1")
	public String add22(@RequestBody Arthamatic obj)
	{
		int i=as.add(obj); 
		if(i>0)
		{
			return "Data set successfully"+i;
		} 
		else 
		{
			return "data not set"+i;
		}
	}

}
