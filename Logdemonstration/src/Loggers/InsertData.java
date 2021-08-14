package Loggers;
import java.mysql.*;
public class InsertData { 
	public static void main(String args[]) throws ClassNotFoundException
	{ 
		try {
		
	     Class.forName("com.mysql.jdbc.Driver"); 
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","Rajesh@523");
	     
	     Statement s=con.createStatement();
	     
	     int i=s.executeUpdate("insert into itg140 values(6,'Kamal','k@gmail.com',910283909)");
	      
	     if(i>0) 
	     {
	    	 System.out.println("Data Inserted successfully");
	     }
	     else 
	     {
	    	 System.out.println("Dta not inserted");
	     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
