package com.example.demo.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	public int addition(Test t)
	{
		int p1=t.getA();
		int p2=t.getB();
		return p1+p2;
		//return t.getA()+t.getB();
	}
	

}
