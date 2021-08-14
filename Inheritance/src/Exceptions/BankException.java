package Exceptions;
import java.util.Scanner;
class BankException1 extends Exception{

	private static final long serialVersionUID = 1L;

	public  BankException1(String s) {
		super(s);
	}
}
public class BankException {
	String name ;
	String accountno;
	int money;
	BankException(String name ,String b,int c){
		this.name=name;
		accountno=b;
		
		c=money;
		
	}
	void depposit(int money,String acno) {
		if(acno.equals(accountno)) {
			this.money+=money;
			System.out.println("You are successfully deposited and your current money is "+this.money);
		}
		else {
			System.out.println("Invalid account Number");
		}
		
	}
	void withdraw(int money,String accountno) {
		if(accountno.equals(this.accountno)) {
			
			if(this.money<=money) {
				try {
					throw new BankException1("money is out of limit");
				}
				catch(BankException1 e) {
					System.out.println(e);
					System.out.println("Insufficient Balance");
				}
			}
			else {
				this.money-=money;
				System.out.println("You are successfully deposited and your money "+money);
			}
			
		}
		else {
			System.out.println("invalid account Number");
		}
		
	}
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		BankException e=new BankException("Rajesh","1234567890",0);
		while(true) {
		System.out.println("1.Deposit\n2.Withdraw\n3.Exit\n");
		int n=obj.nextInt();
		switch(n) {
		case 1:
			System.out.println("enter money to deposit");
			int money=obj.nextInt();
			System.out.println("Enter your account NUmber");
			String acno=obj.next();
			e.depposit(money,acno);
			break;
		case 2:
			System.out.println("enter money to deposit");
			int money1=obj.nextInt();
			System.out.println("Enter your account NUmber");
			String acno1=obj.next();
			e.withdraw(money1,acno1);
			break;
		case 3:
			System.exit(1);
			break;
		default:
			System.out.println("invalid choice");
			
		}
		
		}
		
		
	}

}
