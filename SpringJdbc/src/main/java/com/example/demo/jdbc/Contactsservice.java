package com.example.demo.jdbc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Contactsservice {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public String addContact1(Contacts con) {
		String sql="insert into contacts values(?,?,?,?,?,?)";
		int i=jdbcTemplate.update(sql,con.getId(),con.getFname(),con.getLname(),con.getEmail(),con.getPhoneno(),con.getRole());
		if(i>0) {
			return "Record Updated";
		}
		else {
			return "recrd not updated";
		}
	
	}
	public List<Contacts> search(Contacts con) {
		String name=con.getFname();
		String cname=con.getLname();
		String mname=con.getEmail();
		String sql="select * from contacts where 1=1 ";
		if(name!=null || cname!=null || mname!=null) {
			if(name!=null) {
				String s=name+"%";
				sql=sql+"and fname like '"+s+"'";
			}
			if(cname!=null) {
				String s=cname+"%";
				sql=sql+"and lname like '"+s+"'";
			}
			if(mname!=null) {
				String s=mname+"%";
				sql=sql+"and gmail like '"+s+"'";
			}
			return jdbcTemplate.query(sql,(rm,rowNum)->new Contacts(rm.getInt(1),rm.getString(2),rm.getString(3),rm.getString(4),rm.getString(5),rm.getString(6)));
		}
		else {
			return jdbcTemplate.query(sql,(rm,rowNum)->new Contacts(rm.getInt(1),rm.getString(2),rm.getString(3),rm.getString(4),rm.getString(5),rm.getString(6)));
		}
	}
	@SuppressWarnings("deprecation")
	public String search23(Contacts con) {
		
		String role=con.getRole();
		if(role.equals("manager")) {
		String s=con.getReportsto();
		String sql="select count(*) from contacts where reportsto=? and reportsto!=? and reportsto!=? ";
		
		int i=jdbcTemplate.queryForObject(sql,new Object[] {s,"Rajesh","prasad"},Integer.class);
		if(i>0) {
			s="insert into contacts values(?,?,?,?,?,?,?)";
			int j=jdbcTemplate.update(s,con.getId(),con.getFname(),con.getLname(),con.getEmail(),con.getPhoneno(),con.getRole(),con.getReportsto());
			if(j>0) {
				return "You are successfully added";
			}
			else {
				return "You are not added Due to some conditions are not satisfied";
			}
		}
		else {
				return "You are not a Admin or manager always reports to admin only";
		}
		}
		else {
			String s=con.getReportsto();
			String sql="select count(*) from contacts where reportsto=? and reportsto!=?";
			int val=jdbcTemplate.queryForObject(sql,new Object[] {s,"Ramesh"},Integer.class);
			if(val>0) {
				s="insert into contacts values(?,?,?,?,?,?,?)";
				int j=jdbcTemplate.update(s,con.getId(),con.getFname(),con.getLname(),con.getEmail(),con.getPhoneno(),con.getRole(),con.getReportsto());
				if(j>0) {
					return "You are successfully added";
				}
				else {
					return "You are not added Due to some conditions are not satisfied";
				
			}
			}
			else {
				return "Employee always reports to manager or you are not admin";
			}
			
		}
	}
	
}
