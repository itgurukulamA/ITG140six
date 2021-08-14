import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter two NUmbers");
			int a=obj.nextInt();
			int b=obj.nextInt();
			int c;
			System.out.println("Enter\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Divison");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				c=a+b;
				System.out.println("Addition="+c);
				break;
			
			case 2:
				c=a-b;
				System.out.println("Subtraction="+c);
				break;
			case 3:
				c=a*b;
				System.out.println("Multiplication="+c);
				break;
			case 4:
				c=a/b;
				System.out.println("Divison="+c);
				break;
			default:
				System.out.println("please select a number which is between 1 and 4");
			}
		
		
	}
	}
}
