package com.example.demo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ResourceController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@PostMapping("/addresource")
	public String addResource(@RequestBody Resources res)
	{
		String s=res.getOfficialname();
		int id=res.getId();
		String sql="select * from contacts where reportsto=? and id=?";
		
		List <Map<String,Object>> obj=jdbcTemplate.queryForList(sql,new Object[] {s,id});
		if(!obj.isEmpty()) {
			List obj23=new ArrayList();
			for(Map<String,Object> map:obj) {
				
				for(Map.Entry<String , Object> entry:map.entrySet()) {
					Object obj1=entry.getValue();
					obj23.add(obj1);
				}
			}
			
			sql="insert into resources values(?,?,?,?,?,?)";
			int j=jdbcTemplate.update(sql,res.getId(),obj23.get(1),obj23.get(3),obj23.get(4),obj23.get(6),res.getOfficialname());
			if(j>0) {
				return "record added successfully";
			}
			else {
				return "record is not added";
			}
		}
		else {
			return "You are not a manager or invalid Project Id";
		}
		
		
	}
}
