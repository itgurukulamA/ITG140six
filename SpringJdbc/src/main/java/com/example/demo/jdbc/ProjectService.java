package com.example.demo.jdbc;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	public String addprojects(Projects ps) {
		String name = ps.getMname();
		String sql = "select count(*) from contacts where  fname=? and role=?";
		int obj;
		String roles = "manager";
		obj = jdbcTemplate.queryForObject(sql, new Object[] { name, roles }, Integer.class);
		if (obj == 0) {
			return "You are not a manager";

		} else {
			sql = "insert into projects values(?,?,?,?,?,?,?)";
			int i = jdbcTemplate.update(sql, ps.getId(), ps.getName(), ps.getCname(), ps.getMname(), ps.getStartdate(),
					ps.getEnddate(), ps.getStatus());
			if (i > 0) {
				return "Record inserted Successfully";
			} else {
				return "record not inserted try to check constraints of table";
			}
		}
	}

	@SuppressWarnings("deprecation")
	public List<Projects> serachproject1(Projects ps) {
		String name = ps.getName();
		String cname = ps.getCname();
		String mname = ps.getMname();
		String sql = "select * from projects where 1=1 ";
		if (name != null || cname != null || mname != null) {
			if (name != null) {
				String s = name + "%";
				sql = sql + "and name like '" + s + "'";
			}
			if (cname != null) {
				String s = cname + "%";
				sql = sql + " and cname like '" + s + "'";
			}
			if (mname != null) {
				String s = mname + "%";
				sql = sql + " and createdby like '" + s + "'";
			}
			return jdbcTemplate.query(sql, (rm, rowNum) -> new Projects(rm.getInt(1), rm.getString(2), rm.getString(3),
					rm.getString(4), rm.getString(5), rm.getString(6), rm.getString(7)));
		} else {
			return jdbcTemplate.query(sql, (rm, rowNum) -> new Projects(rm.getInt(1), rm.getString(2), rm.getString(3),
					rm.getString(4), rm.getString(5), rm.getString(6), rm.getString(7)));
		}

	}

	@SuppressWarnings("deprecation")
	public List<Joindata> searchproject20(Projects pc) {
		int id = pc.getId();
		String sql = "select projects.name,projects.cname,projects.createdby,projects.status,projectcontacts.tname,projectcontacts.tid,projectcontacts.resourcename from projects inner join projectcontacts on projects.id=projectcontacts.pid where projects.id=?";
		return jdbcTemplate.query(sql, new Object[] { id }, (rs, rowNum) -> new Joindata(rs.getString(1),
				rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
	}

	public String Updatestatus(Projects pc) {
		String name = pc.getMname();
		String str = "select count(*) from Contacts where role=? and fname=?";
		@SuppressWarnings("deprecation")
		int i = jdbcTemplate.queryForObject(str, new Object[] { "manager", name }, Integer.class);
		if (i > 0) {
			str = "update projects set status=? where id=?";
			int i1 = jdbcTemplate.update(str, pc.getStatus(), pc.getId());
			if (i1 > 0) {
				return "record updated";
			} else {
				return "record not updated";
			}
		} else {
			return "You are not a manager";
		}

	}

	public int countprojects1(Projects ps) {
		String sql = "select count(*) from Projects";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
}
