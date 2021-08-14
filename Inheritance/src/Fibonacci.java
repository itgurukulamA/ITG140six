import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b +" ");
		for(int i=1;i<n-1;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;b=c;

		}

	}

}
