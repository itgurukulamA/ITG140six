import java.util.Scanner;
public class Bigdigit {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int big=0;
		while(n>0) {
			int r=n%10;
			if(big<r) {
				big=r;
			}
			n=n/10;
		}
		System.out.println(big);
	}

}
