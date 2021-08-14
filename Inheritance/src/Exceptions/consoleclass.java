package Exceptions;
import java.io.*; 
public class consoleclass {
	  public static void main(String[] args) {
		Console obj=System.console();
		System.out.println("enter your password");
		char ch[]=obj.readPassword();
		String pass=String.valueOf(ch);
		System.out.println(pass);
		
	} 
	
}
