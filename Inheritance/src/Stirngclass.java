import java.util.Scanner;
public class Stirngclass {
	public static void main(String args[]) {
		System.out.println("hello");
		String s="numeric";
		s="num";
		System.out.println(s);
		s.concat("ber");
		String s2="  Rajesh";
		System.out.println(s2.trim());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		//System.out.println(s2.trim());
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,4));
		System.out.println(s2.length());
		System.out.println(s2.indexOf('a'));
		s2="Rajesh is good boy";
		System.out.println(s2.indexOf("is"));
		System.out.println(s2.startsWith("boy"));
		System.out.println(s2.endsWith("boy"));
		String s4="hai";
		StringBuffer s3=new StringBuffer("Hello");
		System.out.println(s3.reverse());;
		int c=s2.compareTo(s4);
		if(c==0) {
			System.out.println("Strings are equal");
		}
		else if(c>0) {
			System.out.println("String 1 is greaterthan string2");
		}
		else {
			System.out.println("String2 is greater than string1");
		}
		
		
	}

}
