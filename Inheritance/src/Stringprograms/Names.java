package Stringprograms;
import java.util.*;
public class Names {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s[]= {"Raju","ramu","rani","navven","kamal"};
		System.out.println("enetr acharacter to search");
		char c=obj.next().charAt(0);
		for(int i=0;i<s.length;i++) {
			
			if(s[i].charAt(i)==c ) {
				System.out.println(s[i]);
				
			}
			
			
		}
		
	}

}
