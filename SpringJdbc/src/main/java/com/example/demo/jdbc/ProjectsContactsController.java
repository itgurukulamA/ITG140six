package com.example.demo.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectsContactsController {
	
	@Autowired
	ProjectContactsService pc;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@PostMapping("/apc")
	public String addpc(@RequestBody ProjectContacts pc1) {
		
		String s=pc.addpcs(pc1);
		return s;
		
	}
	@PostMapping("pcsearch")
	public List<ProjectContacts> pcserach(@RequestBody ProjectContacts pc1) {
		return pc.pcsearch(pc1);
	}
//	@PostMapping("getall")
//	public List<ProjectContacts> Getall(@RequestBody ProjectContacts pc1) {
//		return pc.getallemploees(pc1);
//	}
	@SuppressWarnings("deprecation")
	@PostMapping("getalltasks")
	public List<Map<String,Object>> getTasks(@RequestParam String resourcename){
	
		String resourcename1=resourcename;
		if(resourcename1.equals("ramesh")) {
			String sql="select * from projectcontacts";
			return jdbcTemplate.queryForList(sql);	
		}
		else {
		String sql="select tname  from  projectcontacts where resourcename=? or createdby=?";
		return jdbcTemplate.queryForList(sql,new Object[] {resourcename1,resourcename1});
		}
	}
	@PostMapping("getthree")
	public List<Map<String,Object>> getthreevalues(){
		String sql="select pid,tid,tname from projectcontacts ";
		return jdbcTemplate.queryForList(sql);
	}
	@PostMapping("resrestab")
	public String addresourcebasedonrestab(@RequestBody ProjectContacts pc1) {
		return pc.addrs(pc1);
	}
}
