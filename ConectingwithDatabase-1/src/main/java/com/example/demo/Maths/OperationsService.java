package com.example.demo.Maths;

import org.springframework.stereotype.Service;

@Service
public class OperationsService {
	public int add(Operations op)
	{
		return op.getMes()+ op.getMss();
	}

}
