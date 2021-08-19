package Strings;
import java.util.Scanner;
public class ReverseWordString 
{
 public String demo(String s1)
 {
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
    	s2=s2+(s1.charAt(i));
	}
	return s2;
 }
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	ReverseWordString obj=new ReverseWordString();
	System.out.println("Enter a string");
	String s=sc.nextLine();
	System.out.println(obj.demo(s));
 }
}
