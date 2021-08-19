package Strings;

import java.util.Scanner;

public class RemoveChar
{	
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
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				s3+=s1.charAt(i);
			}
		}
	}
	for(int i=0;i<s3.length();i++)
	{
		String s4=s3.charAt(i)+"";
		s1=s1.replace(s4,"");
		s2=s2.replace(s4,"");
	}
	System.out.println(s1);
	System.out.println(s2);
}
}
