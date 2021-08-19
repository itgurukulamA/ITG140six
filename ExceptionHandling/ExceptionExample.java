package ExceptionHandling;

import java.util.Scanner;

public class ExceptionExample 
{
 public void withdraw(int amount) throws Exception 
 { 
	 int balance=5000; 
	 if(amount>balance)
	 {
	  try 
	  {
	     throw new Exception();
	  }
	 catch(Exception e)
	 {
		 System.out.println("Insufficeint funds ");
	 }
     }
	 else
	 {
		 System.out.println("going to withdraw ");
	 }
 }
public static void main(String[] args) throws Exception
{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values a and b:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int arr[]= {1,2,3,4,5};
	ExceptionExample ex=new ExceptionExample();
	ex.withdraw(6000);
	try
    {
	        try 
	        {
	          System.out.println(arr[6]);
	        }
	        catch(ArrayIndexOutOfBoundsException e)
       	    {
		      System.out.println(e);
	        }
	  System.out.println(a/b);
    }
	 catch(ArithmeticException e)
    {
    	e.printStackTrace();
    }
	finally
	{
		System.out.println("End of the Program");
	}
}
}