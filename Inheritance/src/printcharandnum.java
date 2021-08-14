import java.util.Scanner;
public class printcharandnum {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a character");
		char c=obj.next().charAt(0);
		System.out.println("enter a number");
		int n=obj.nextInt();
		System.out.println("entered character="+c);
		System.out.println("entered number="+n);
	}

}
