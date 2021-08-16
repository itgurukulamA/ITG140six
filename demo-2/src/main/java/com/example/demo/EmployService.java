package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class EmployService {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertItems(Employs e) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO employee (id,name) VALUES (:Id,:Name)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("Id", e.getId())
					.addValue("Name",e.getName());

			result = namedParameterJdbcTemplate.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		
		} catch (Exception ex) {
			data.put("error", "Error occured, please try again!");
			System.out.println(ex);
			
		}
		
		return data;

	}
	

}
