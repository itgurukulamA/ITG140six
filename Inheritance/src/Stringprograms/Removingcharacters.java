package Stringprograms;
import java.util.*;
public class Removingcharacters {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println("Enter a character to delete");
			char c=obj.next().charAt(0);
			String s3=String.valueOf(c);
			s=s.replace(s3,"");
			System.out.println(s);
			System.out.println("Do You want to Continue for removing the character enter y or n");
			char c1=obj.next().charAt(0);
			if(c1=='y') {
				System.exit(1);
			}	
		}
		
		
	}

}
