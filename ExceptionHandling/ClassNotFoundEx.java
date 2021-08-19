package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassNotFoundEx {
public static void main(String args[]) throws Exception
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","admin123");
		Statement st=con.createStatement();
		st.executeUpdate("insert into mss values(45,'ram',21,124,'a@gmail.com','sr dev',12345)");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}
