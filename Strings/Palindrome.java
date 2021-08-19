package Strings;
import java.util.Scanner;
public class Palindrome 
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   String s1;
   String s2="";
   System.out.println("Enter string");
   s1=sc.nextLine();
   for(int i=s1.length()-1;i>=0;i--)
   {
	   s2=s2+s1.charAt(i);
   }
   if(s1.equalsIgnoreCase(s2))
   {
	   System.out.println("Palindrome");
   }
   else
   {
	   System.out.println("Not a palindrome");
   }
 }
}
