package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@Autowired
TestService ts;

@PostMapping("/add")
public int addition1(@RequestBody Test t)
{
	int i=ts.addition(t);
	return i;
}
}