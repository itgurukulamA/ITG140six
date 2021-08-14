package Stringprograms;
import java.util.*;

public class Vowelsandconsonants {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		int vow=0,consonants=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='E'||s.charAt(i)=='U') {
				vow++;
			}
			else {
				consonants++;
			}
		}
		System.out.println(vow+" "+consonants);
		
		
	}
}
