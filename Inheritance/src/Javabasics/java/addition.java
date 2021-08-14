package Javabasics.java;
import java.util.*;
public class addition {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int original=n;
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==original) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a aplindrome");
		}

	}

}
