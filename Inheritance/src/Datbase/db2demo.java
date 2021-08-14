package Datbase;
import java.sql.*;
public class db2demo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:5021/itgdb","itgusr5","miracle5");
		System.out.println(con);
		System.out.println("Execution done successfully");
	}
}
