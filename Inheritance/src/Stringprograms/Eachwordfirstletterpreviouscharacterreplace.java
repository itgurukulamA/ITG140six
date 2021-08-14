package Stringprograms;
import java.util.*;
public class Eachwordfirstletterpreviouscharacterreplace {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		char c=Character.toUpperCase(s.charAt(0));
		String s2=String.valueOf(c);
		String s3=String.valueOf(s.charAt(0));
		s=s.replace(s3,s2);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c=Character.toUpperCase(s.charAt(i+1));
				s2=String.valueOf(c);
				s3=String.valueOf(s.charAt(i+1));
				s=s.replace(s3, s2);
				
			}
		}
		System.out.println(s);
		
	}

}
