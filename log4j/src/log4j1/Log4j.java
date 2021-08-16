package log4j1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.log4j.Logger;
//import java.util.logging.Logger;

public class Log4j {
	static Logger log = Logger.getLogger(Log4j.class);
	public static void main(String args[]) throws ClassNotFoundException
	{
	try
	   {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");   
		PreparedStatement ps1= con.prepareStatement("insert into itg140(id,name,age,email,phno) values(3,'singh',22,'vkandukuri@gmail.com',9866)");
		int result  = ps1.executeUpdate();
		if (result>0)
		{
			log.info("Values inserted Succesfully");
			System.out.println("values are not inserted Succesfully");
		} 
		else
		{
			System.out.println("values are  not inserted");
		}
				
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	//log.error("error found");
	}
}
