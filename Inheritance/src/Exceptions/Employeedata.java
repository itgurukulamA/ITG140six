package Exceptions;
import java.sql.*;
import java.util.*;
public class Employeedata {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Scanner obj=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","Rajesh@523");
		while(true) {
			System.out.println("\t----------");
			System.out.println("\t1.GetallEmployeedetails\n\t2.Search by Id\n\t3.searchbyfirstname and lastname\n\t4.Exit");
			System.out.println("\t----------");
			System.out.println("Enter your choice");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				System.out.println("The Employee details");
				PreparedStatement ps=con.prepareStatement("select * from employess");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
				
				break;
			case 2:
				System.out.println("Enter employee id to find");
				long id=obj.nextLong();
				PreparedStatement ps1=con.prepareStatement("select * from employess where empid=?");
				ps1.setLong(1, id);
				 rs=ps1.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
				break;
			case 3:
				System.out.println("enter employee firstname and lastname to serach");
				String f1=obj.next();
				String f2=obj.next();
				f1=f1+"%";
				f2=f2+"%";
				PreparedStatement ps2=con.prepareStatement("select * from employess where efname like ? and elname like ?");
				ps2.setString(1, f1);
				ps2.setString(2, f2);
				ResultSet rs2=ps2.executeQuery();
				while(rs2.next()) {
					System.out.println(rs2.getLong(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getInt(4));
				}
				break;
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice plese engter valid option");
			}
			
		}
	}

}
