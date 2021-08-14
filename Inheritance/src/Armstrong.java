import java.util.*;
public class Armstrong {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		int n1=n;
		while(n>0) {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("it is armstrong Number");
		}
		else {
			System.out.println("it is not a armstrong Number");
		}

		}

}
