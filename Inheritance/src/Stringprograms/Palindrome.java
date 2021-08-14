package Stringprograms;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s1=obj.next();
		
		
			int flag=0;
			int j=s1.length()-1;
			for(int i=0;i<=j;i++) {
				if(s1.charAt(i)!=s1.charAt(j)) {
					flag=1;
					break;
				}
				j--;
				
				
			}
			if(flag==0) {
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are not equal");
			}
			
		
	}

}
