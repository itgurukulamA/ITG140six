import java.util.Scanner;
public class leapyearornot {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n%400==0) {
			System.out.println("It is leap year");
		}
		else if(n%100==0) {
			System.out.println("it is not a leap year");
		}
		else if(n%4==0) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not a leap year");
		}
		
	}

}
