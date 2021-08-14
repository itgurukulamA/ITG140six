package com.example.demo.test;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.test.*;
@Service
public class Emp_service {
	@Autowired
	JdbcTemplate jdbctemplate;
	public String insertEmp(Emp emp) {
		int id =emp.getId();
		String sql="insert into employee values(?,?)";
		int i=jdbctemplate.update(sql,id,emp.getName());
		if(i>0)
			return "inserted";
		else
			return "not";
	}
	public String updatemp(Emp emp) {
		int id=emp.getId();
		String sql="update employee set ename=? where empid=?";
		int i=jdbctemplate.update(sql,emp.getName(),emp.getId());
		if(i>0) {
			return "record update";
		}
		else {
			return "record not updated";
		}
	}
	public String deletemp(Emp emp) {
		int id=emp.getId();
		String sql="delete from employee where empid=?";
		int i=jdbctemplate.update(sql,emp.getId());
		if(i>0) {
			return "record deleted";
		}
		else {
			return "record not deleted";
		}
	}
	@SuppressWarnings("deprecation")
	public List<Emp> getemployee(int id) {
		String sql="select * from employee where empid=?";
		return (List<Emp>) jdbctemplate.query(sql,new Object[] {id},
				(rs,rowNum)->new Emp(
						rs.getInt(1),
						rs.getString(2)
						)
				);
		
	}
	@SuppressWarnings("deprecation")
	public List<Emp> getemployees() {
		String sql="select * from employee ";
		return (List<Emp>) jdbctemplate.query(sql,
				(rs,rowNum)->new Emp(
						rs.getInt(1),
						rs.getString(2)
						)
				);
		
	}
	@SuppressWarnings("deprecation")
	public List<Emp> getsearch(Emp emp){
		List<Emp> obj=null;
		if(emp.getId()==0) {
			if(emp.getName()==null) {
				
			}
			else {
				String s=emp.getName()+"%";
				String sql="select * from employee where ename like '"+s+"' ";
				return (List<Emp>) jdbctemplate.query(sql,new Object[] {},
						(rs,rowNum)->new Emp(
								rs.getInt(1),
								rs.getString(2)
								)
						);
			}
		}
		else {
			if(emp.getName()==null)
			{
				String s=emp.getId()+"%";
				String sql="select * from employee where empid like '"+s+"' ";
				return (List<Emp>) jdbctemplate.query(sql,
						(rs,rowNum)->new Emp(
								rs.getInt(1),
								rs.getString(2)
								)
					);
				
			}
			else {
				String s2=emp.getId()+"%";
				String s=emp.getName()+"%";
				String sql="select * from employee where empid like '"+s2+"' and ename like '"+s+"'";
				return  (List<Emp>) jdbctemplate.query(sql,new Object[] {},
						(rs,rowNum)->new Emp(
								rs.getInt(1),
								rs.getString(2)
								)
					);
				
			}
		}
		 String sql="select * from employee";
	     return (List<Emp>) jdbctemplate.query(sql,
				(rs,rowNum)->new Emp(
						rs.getInt(1),
						rs.getString(2)
						)
			);
		
		
	}

}
