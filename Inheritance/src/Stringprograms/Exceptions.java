package Stringprograms;
import java.util.*;
public class Exceptions {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		try {
			try {
				int d=a/b;
				System.out.println(d);
			}
			catch(Exception e) {
				System.out.println("hello");
				try {
					int d=a/b;
				}
				finally {
					System.out.println("Finall bloc in catch");
				}
			}
			finally {
				System.out.println("Finally Block");
			}
			int c=a/b;
			System.out.println("Addition="+c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("hello");
		}
		finally {
			System.out.println("finally block outside try");
		}
	}
	

}
