package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectsController {

	@Autowired
	ProjectService ps;
	
	@PostMapping("/aproject")
	public String addProject(@RequestBody Projects ps1) {
		
		String s1=ps.addprojects(ps1);
		return s1;
	}
	@PostMapping("/psearch1")
	public List searchproject24(@RequestBody Projects ps1) {
		return ps.serachproject1(ps1);
	}
	@PostMapping("/psearch")
	public List searchproject23(@RequestBody Projects ps1){
		return ps.searchproject20(ps1);
	}
	@PostMapping("/ustatus")
	public String Updatestatus(@RequestBody Projects ps1) {
		return ps.Updatestatus(ps1);
	}
	@PostMapping("/pcount")
	public int countproj(@RequestBody Projects ps1) {
		return ps.countprojects1(ps1);
	}
}
