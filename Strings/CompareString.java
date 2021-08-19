package Strings;

import java.util.Scanner;

public class CompareString {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String1:");
	String s1=sc.nextLine();
	System.out.println("Enter String2:");
	String s2=sc.nextLine();
	 int len1=s1.length();
	int len2=s2.length();
	char str1[]=s1.toCharArray();
	char str2[]=s2.toCharArray();
	int flag=1;
	if(len1==len2)
	{
		for(int i=0;i<len1;i++)
		{
			if(str1[i]!=str2[i])
			{
				flag=0;
				break;
			}
		}
	}
	else
	{
		flag=0;
	}
	if(flag==1)
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println("Not Equal");
	}
}
}
