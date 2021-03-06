package com.example.demo.DatabaseConnection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController { 
	@Autowired
	StudentService obj;
	@Autowired
	JdbcTemplate jdbc;
	@Autowired 
	NamedParameterJdbcTemplate namedJdbcTemplate; 
	@Autowired
	JavaMailSender javaMailSender;
	
	@PostMapping("/istudent")
	public String insertData(@RequestBody Student s) 
	{
		int j=obj.insert(s);
		if(j>0)
		{
			return "Data Inserted Successfully";
		}
		else
		{
			return "Data is not inserted";
		}
	}
    @PostMapping("/count")
    public String findList(@RequestBody Student s)
    { 
    	String sql="select count(*) from itg140 where id=?";
		@SuppressWarnings("deprecation")
		int i=jdbc.queryForObject(sql, new Object[] {s.getId()},Integer.class);
		if(i>0)
		{
			return "The Id already Exists please find Another id";
		}
		else {
			int id=s.getId();
			String name=s.getName();
			String email=s.getEmail();
			String phno=s.getPhoneNo(); 
			String sql1="insert into itg140 values(?,?,?,?)"; 
			int j=jdbc.update(sql1,id,name,email,phno);
			if(j>0)
			{
				return "data inserted";
			}
			else
			{
				return "data is not inserted";
			}
		}
    	
    }  
    @PostMapping("/insertbynamedjdbc") 
    public String insertOne(@RequestBody Student obj) 
    {
    	String sql="insert into itg140 values(:id,:name,:email,:phno)";
    	Map<String ,Object> in=new HashMap<String ,Object>();
    	in.put("id", obj.getId());
    	in.put("name", obj.getName());
    	in.put("email", obj.getEmail());
    	in.put("phno", obj.getPhoneNo());
    	int i=namedJdbcTemplate.update(sql, in);
    	if(i>0)
    	{
    		return "Data Inserted Successfully";
    	}
    	else
    	{
    		return "data is not Inserted";
    	}
    }
    //Updating the data By using NamedJdbcTemplate 
    @PostMapping("/updateOne") 
    public String updateValue(@RequestBody Student s) 
    {
    	String sql="update itg140 set name=:name where id=:id ";
    	Map<String,Object> in=new HashMap<String,Object>(); 
    	in.put("name",s.getName());
    	in.put("id", s.getId()); 
    	int i=namedJdbcTemplate.update(sql,in);
    	if(i>0)
    	{
    		return "Data Updated Suucessfully";
    	} 
    	else
    	{
    		return "Data not updated";
    	}
    } 
    //Selecting the data by using NamedJdbcTemplate 
    @PostMapping("/selectone") 
    public Student selectrecord(@RequestBody Student s) 
    {
    	String sql="select * from itg140 where id =:id";
    	Map<String,Object> in=new HashMap<String,Object>();
    	in.put("id", s.getId());
    	Student j=namedJdbcTemplate.queryForObject(sql,in, (rs,rowNum)-> new Student(
    				 rs.getInt("id"),
    				 rs.getString("name"),
    				 rs.getString("email"),
    				 rs.getString(4)
    				 )
    	);
    	return j;
    } 
    //Demonstration of Query For List 
    @GetMapping("/get") 
    public int  getAllrecords()
    {
    	String sql="select * from itg140";  
    	List<Student> obj=namedJdbcTemplate.query(sql, (rs,rowNum)->new Student(
    			rs.getInt(1),
    			rs.getString(2),
    			rs.getString(3),
    			rs.getString(4)
    			)); 
    	System.out.println(obj);
    	
    	Iterator it=obj.iterator();
    		System.out.println(it);
    	int count=0;
    	while(it.hasNext())
    	{ 
    		Student s=(Student)it.next();
    		System.out.println(s.getId());
    		count++;
    	}
    	System.out.println(count);
    	return count;
    	
    } 
    @PostMapping("/sendmail")
    public String sendEmail(Mail obj)
    {
    	try {
    	SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(obj.getTo());

        msg.setSubject(obj.getSub());
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg); 
        return "Mail Sent";
    	}
    	catch(Exception e)
    	{
    		return "Mail Not sent";
    	}
    }
}
