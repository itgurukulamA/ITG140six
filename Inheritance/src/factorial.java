import java.util.Scanner;
public class factorial {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
