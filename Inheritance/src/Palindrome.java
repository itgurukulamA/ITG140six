import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int rev=0;
		int rev1=n;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev1==rev) {
			System.out.println("It is palindrome");

		}
		else {
			System.out.println("It is not palindrome");

		}
	}

}
