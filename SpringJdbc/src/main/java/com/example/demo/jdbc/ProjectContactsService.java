package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class ProjectContactsService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@SuppressWarnings("deprecation")
	public String addpcs(ProjectContacts ps) {
		String name=ps.getCreatedby();
		String sql="select count(*) from contacts where role=? and fname=? ";
		int obj;
		String roles="manager";
		
		obj=jdbcTemplate.queryForObject(sql,
				new Object[]{ roles,name},
				Integer.class);
		if(obj==0) {
			return "You are not a manager ";

		}
		else {
			sql="select count(*) from projects where  id=?";
			int id=ps.getPid();
			obj=jdbcTemplate.queryForObject(sql,
					new Object[]{ id},
					Integer.class);
			if(obj!=0) {
			sql="insert into projectcontacts values(?,?,?,?,?,?,?)";
			int i=jdbcTemplate.update(sql,ps.getPid(),ps.getTid(),ps.getTname(),ps.getCreatedby(),ps.getSdate(),ps.getEdate(),ps.getResourcename());
			if(i>0) {
				return "Record inserted Successfully";
			}
			else {
				return "record not inserted try to check constraints of table";
			}
			}
			else {
				return "invalid project id";
			}
		}
	      
	}
	public List<ProjectContacts> pcsearch(ProjectContacts pc) {
		  int pid=pc.getPid();
		  String sql="select * from projectcontacts where pid=?";
		  return (List<ProjectContacts>) jdbcTemplate.query(sql,new Object[] {pid},(rs,rowNum)->new ProjectContacts(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
	}
	@SuppressWarnings("deprecation")
	public List<String> getTasks1(ProjectContacts pc){
		String resourcename1=pc.getResourcename();
		String sql="select tname  from  projectcontacts where resourcename=? or createdby=?";
		return jdbcTemplate.queryForList(sql,new Object[] {resourcename1,resourcename1},String.class);
	}
	public String addrs(ProjectContacts pc)
	{
		int pid=pc.getPid();
		String s1=pc.getResourcename();
		String sql="select count(*) from resources where id=? and Name=? ";
		int i=jdbcTemplate.queryForObject(sql,new Object[] {pid,s1},Integer.class);
		if(i>0) {
			sql="insert into projectcontacts(tid,pid,tname,createdby,sdate,edate,resourcename) values(?,?,?,?,?,?,?)";
			i=jdbcTemplate.update(sql,pc.getPid(),pc.getTid(),pc.getTname(),pc.getCreatedby(),pc.getSdate(),pc.getEdate(),pc.getResourcename());
			if(i>0) {
				return "record successfully inserted";
			}
			else {
				return "record not inserted";
			}
		}
		else {
			return "Employee resource or id is not available";
		}
		
	}
}
