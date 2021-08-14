package Exceptions;
import java.util.*;
import java.sql.*;
class A extends Exception{
	private static final long serialVersionUID = 1L;

	A(String s){
		super(s);
	}
}
public class Storedetailsindatbase {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Scanner obj=new Scanner (System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","Rajesh@523");
		System.out.println("connection established");
		while(true) {
			System.out.println("\t--------------");
			System.out.println("\t1.Create Account\n\t2.Withdraw\n\t3.Deposit\n\t4.Checkbalance\n\t5.Money Transfer\n\t6.Exit");
			System.out.println("\t--------------");
			System.out.println("Enter your choice");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter userid");
				String sid=obj.next();
				System.out.println("Enter fname");
				String fname=obj.next();
				System.out.println("Enter your Lname");
				String s=obj.next();
				System.out.println("Enter your account no");
				int id=obj.nextInt();
				PreparedStatement  ps=con.prepareStatement("select * from  transactions23 where uname=? or accountno=? ");
				ps.setString(1, sid);
				ps.setLong(2, id);
				ResultSet j=ps.executeQuery();
				boolean b=j.absolute(1);
     			if(b==false) {
     				ps=con.prepareStatement(" insert into transactions23 values(?,?,?,0,?) ");
					ps.setString(1, sid);
					ps.setString(2, fname);
					ps.setString(3, s);
					ps.setLong(4, id);
					int i=ps.executeUpdate();
					if(i>0) {
					System.out.println("Your account created successfully");
					}
				else {
					System.out.println("Something went Wrong Please try again");
					}
     			}
				else {
     			System.out.println("Account already exists");
				}
			break;
			case 2:
				System.out.println("Enter Your user id");
				String ah=obj.next();
				System.out.println("Enter account Number");
				long l=obj.nextLong();
				ps=con.prepareStatement("select * from  transactions23 where uname=? or accountno=? ");
				ps.setString(1, ah);
				ps.setLong(2, l);
				ResultSet r=ps.executeQuery();
				if(r.absolute(1)) {
					try {
						System.out.println("Enter Money you want to withdraw");
						long n1=obj.nextLong();
						long bal=r.getLong(4);
						
						if(bal>n1) {
							ps=con.prepareStatement("update transactions23 set bal=bal-? where accountno=?");
							ps.setLong(1, n1);
							ps.setLong(2, l);
							int i=ps.executeUpdate();
							if(i>0) {
								System.out.println("Your transaction is done successfully");
								System.out.println("Your withdraw money is "+n1);
							}
						}
						else {
							System.out.println("hello");
							throw new A("Balance is not sufficient to withdraw");
						}
						
					}
					catch(A e) {
						System.out.println(e);
					}
				}
				else {
					System.out.println("invalid accout no or user id");
				}
				
				break;
			case 3:
				System.out.println("Enter Your user id");
				String ah1=obj.next();
				System.out.println("Enter account name");
				long l1=obj.nextLong();
				ps=con.prepareStatement("select * from  transactions23 where uname=? or accountno=? ");
				ps.setString(1, ah1);
				ps.setLong(2, l1);
				ResultSet r1=ps.executeQuery();
				
				if(r1.absolute(1)) {
					try {
						long totbal1=r1.getLong(4);
						System.out.println("Enter Money you want to Deposit");
						long n1=obj.nextLong();
						long bal=r1.getLong(4);
						if(n1>500) {
							ps=con.prepareStatement("update transactions23 set bal=bal+? where accountno=?");
							ps.setLong(1, n1);
							ps.setLong(2, l1);
							int i=ps.executeUpdate();
							System.out.println(i);
							if(i>0) {
								System.out.println("Your transaction is done successfully");
								System.out.println("Your account Balance is "+(n1+bal));
							}
							else {
								throw new A("Something went wrong while depositing money");
							}
						}
						else {
							throw new A("Enter a balance which is greater than 499");
						}
						
					}
					catch(A e) {
						System.out.println(e);
					}
				}
				else {
					System.out.println("invalid accout no or user id");
				}
				
				break;
			case 4:
				System.out.println("--------------------");
				System.out.println("Enter your user id");
				String userid1=obj.next();
				System.out.println("Enter your account no");
				long acno1=obj.nextLong();
				ps=con.prepareStatement("select * from transactions23 where uname=? or accountno=? ");
				ps.setString(1, userid1);
				ps.setLong(2, acno1);
				ResultSet rset1=ps.executeQuery();
				try {
				if(rset1.absolute(1)) {
					long accountbal=rset1.getLong(4);
					String fname1=rset1.getString(2);
					String lname1=rset1.getString(3);
					System.out.println("Account Holder first name"+fname1);
					System.out.println("Account Holder Last Name"+lname1);
					System.out.println("Your account balance is "+accountbal);
				}
				else {
					throw new A("invalid credientials");
					
				}
				}
				catch(A e)
				{
					System.out.println(e);
				}
				
				break;
			case 5:
				System.out.println("Enter your user id");
				String userid=obj.next();
				System.out.println("Enter your account no");
				long acno=obj.nextLong();
				ps=con.prepareStatement("select * from transactions23 where uname=? or accountno=? ");
				ps.setString(1, userid);
				ps.setLong(2, acno);
				ResultSet rset=ps.executeQuery();
				if(rset.absolute(1)) {
					long cbal=rset.getLong(4);
					try {
					System.out.println("Enter recipient user id for money transfer");
					String auid=obj.next();
					System.out.println("Enter recepient Account NO");
					long raccno=obj.nextLong();
					ps=con.prepareStatement("select * from transactions23 where uname=? or accountno=?");
					ps.setString(1, auid);
					ps.setLong(2, raccno);
					rset=ps.executeQuery();
					
					if(rset.absolute(1)) {
						
						System.out.println("Enter money you want to transfer");
						long mon=obj.nextLong();
						if(mon<cbal) {
							System.out.println("Enter money you want to transfer");
							ps=con.prepareStatement("update transactions23 set bal=bal-? where  accountno=?");
							ps.setLong(1, mon);
							ps.setLong(2, acno);
							int i=ps.executeUpdate();
							
							if(i>0) {
								System.out.println(i);
								ps=con.prepareStatement("update transactions23 set bal=bal+? where  accountno=?");
								ps.setLong(1, mon);
								ps.setLong(2,raccno);
								int m=ps.executeUpdate();
								
								if(m>0) {
									System.out.println("You account balance transfer is done successfully For mored tetails check your balance1");
								}
								else {
									ps=con.prepareStatement("update transactions23 set bal=bal+? where accountno=?");
									ps.setLong(1, mon);
									ps.setLong(2,acno);
									ps.executeUpdate();
									
									throw new A("Something went wrong while trasferring the money");
								}
								
							}
							else {
								throw new A("sorry something went wrong while tranferring the money");
							}
							
						}
						else {
							throw new A("you donot  have not enough alance to trnasfer");
						}
						
					}
					
					
					else {
						throw new A("No recipiennt user found");
						
					}
					}
					catch (A e) {
						e.printStackTrace();
					}
					
				}
				else {
					System.out.println("Invalid userid or account no");
				}
				break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice please select valid displayed Number");
			}
			
		}
		
	}

}
