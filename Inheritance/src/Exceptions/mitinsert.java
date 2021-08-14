package Exceptions;

import java.sql.*;
import java.util.Scanner;
public class mitinsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter id");
		int n=obj.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","Rajesh@523");
		System.out.println("connection Estabblished");
		PreparedStatement ps=con.prepareStatement("select * from student where id=?");
		ps.setInt(1, n);
		ResultSet s=ps.executeQuery();
		System.out.println(s.absolute(1)); 
		System.out.println(s.getString("age")+" "+s.getString("name"));
	}
}
