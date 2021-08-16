package com.example.demo.Arthematic;

import org.springframework.stereotype.Service;

@Service
public class ArthamaticService {
	public int add(Arthamatic ar)
	{
		return ar.getMes()+ar.getMss();
	}

}
