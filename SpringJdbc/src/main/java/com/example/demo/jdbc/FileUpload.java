package com.example.demo.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FileUpload {
	@Autowired
	JdbcTemplate jdbctemplate;
	@PostMapping("/upyourfile")
	public String uploadfile(@RequestParam String s1) {
		String s="insert into files(filename) values(?)";
		int i=jdbctemplate.update(s,new Object[] {s1});
		if(i>0) {
			return "file uploaded successfully";
		}
		else {
			return "file not uploaded";
		}
	}
	@SuppressWarnings("resource")
	@GetMapping("/getfile")
	public String getfilecontents (@RequestParam Integer s1) throws IOException {
		String s="select * from files where id=?";
		s1=(int) s1;
		List<Map<String, Object>> obj=jdbctemplate.queryForList(s,new Object[] {s1});
		if(obj.isEmpty()) {
			return "no file id exists";
		}
		else {
			List l=new ArrayList();
			for(Map<String,Object> obj1:obj) {
				for(Map.Entry<String, Object> m1:obj1.entrySet()) {
					l.add(m1.getValue());
				}
			}
			String file=(String) l.get(1);
			FileInputStream fi=new FileInputStream(file);
			String content="";
			int m;
			while((m=fi.read())!=-1) {
				char ch=(char) m;
				content=content+" "+ch;
				System.out.println(content);
			}
			return content;
		}
	}

}
