package Strings;

import java.util.Scanner;

public class CommonChar {
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1=sc.nextLine();
		System.out.println("Enter String2:");
	    String s2=sc.nextLine();
	    String s3="";
	    for(int i=0;i<s1.length();i++)
	    {
	    	char ch=s1.charAt(i);
	    	if(s2.indexOf(ch)!=-1)
	    	{
	    		s3=s3+String.valueOf(ch);
	    	}
	    }
	    System.out.println(s3);
	 }
	}
