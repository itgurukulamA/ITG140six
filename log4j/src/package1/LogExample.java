package package1;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class LogExample {
	
	 static Logger log=Logger.getLogger(LogExample.class);
	public static void main(String[] args) throws ClassNotFoundException{
	//Properties.con
	System.out.println("Hello");
	log.info("record inserted");
	BasicConfigurator.configure();
	// TODO Auto-generated method stub
	try {
	//PropertyConfigurator.configure("log.properties");
	 System.out.println("Hello1");
	 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Sai@1234");
	     PreparedStatement  a=con.prepareStatement("insert into itg140 values(78,'ganesh',21,63200362,'aa@jshh')");
	     int rs = a.executeUpdate();
	     if (rs>0) {
	     System.out.println("Hello");
	     log.info("record inserted");
	     }
	     else {
	     log.info("not inserted");
	     }
	}
	catch(Exception e){
	     log.error("Exception occured"+e);
	     }
	}
	

}
