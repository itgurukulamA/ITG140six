package Exceptions;
import java.util.*;
class Showbalance extends Exception{
	
	private static final long serialVersionUID = 1L;

	Showbalance(String s){
		super(s);
	}
}
class Withdraw extends Exception{
	private static final long serialVersionUID = 1L;

	Withdraw(String s){
		super(s);
	}
}
class Deposit extends Exception{
	private static final long serialVersionUID = 1L;

	Deposit(String s){
		super(s);
	}
}
public class CompleteExceptionHandling {
	int bal=0;
	void withdraw(int bal)  {
		if(bal>this.bal) {
			try {
				throw new Withdraw("Amount is greater than amount in the account");
			}
			catch(Withdraw w) {
				System.out.println(w);
			}
			
		}
		else {
			this.bal-=bal;
			System.out.println("you are successfully with draw "+bal);
			System.out.println("Your Account balance is"+this.bal);
		}
		
}
	void deposit(int mon) throws Deposit {
		if(mon<500) {
			try {
			
			throw new Deposit("Minimum balance Required 500");
			}
			catch(Deposit e) {
				System.out.println(e);
			}
		}
		else {
			bal+=mon;
			System.out.println("you are successfully with deposit "+bal);
			System.out.println("Your Account balance is"+this.bal);
		}
		
		
	}
	void showbalance() {
		System.out.println("Your account balance is"+this.bal);	
		
	}
	public static void main(String args[]) throws Deposit { 
		Scanner obj=new Scanner(System.in);
		String uid="Rajesh";
		String pass="Rahu123";
		CompleteExceptionHandling obj1=new CompleteExceptionHandling();
		
		boolean ch=true;
		int flag=1;
		while(ch) {
		System.out.println("Enter userId");
		String s=obj.next();
		System.out.println("Enter password");
		String s1=obj.next();
		if(s.equals(uid) && s1.equals(pass)) {
			ch=false;
			
		}
		else if(flag<=3){
			System.out.println("invalid credientials");
		}
		else {
			System.out.println("Your time out please try again after some time");
			System.out.println("End");
			System.exit(1);
		}
		flag++;
		
		}
		while(true) {
		System.out.println("Enter choice\n1.Withdraw\n2.Deposit\n3.ShowBalance\n4.Exit\n");
		int n=obj.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter money you want to withdraw");
			int bal=obj.nextInt();
			obj1.withdraw(bal);
			break;
		case 2:
			System.out.println("Enter money you want to deposit");
			int mon=obj.nextInt();
			obj1.deposit(mon);
			break;
		case 3:
			int j=1;
			while(true) {
				System.out.println("Enter your accountnno");
				String ac=obj.next();
				if(j>2) {
					System.out.println("please try again after sometime");
					System.exit(1);
				}
				else if(ac.equals(uid)) {
					break;
				}
				else {
					try {
						throw new  Showbalance("Invalid account Number");
						
					}
					catch(Showbalance e) {
						System.out.println(e);
					}
				}
				j++;
				
			}
			obj1.showbalance();
			break;
		case 4:
			System.exit(1);
			break;
		default:
			System.out.println("Invalid choice please enter a valid Option");
		}
		
		}
		
	}

}
