import java.util.Scanner;
public class ternary {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		int c=n1>=n2?1:0;
		if(c==1) {
			System.out.println(n1+"is bigger than or equal to "+n2);
		}
		else {
			System.out.println(n1+"is greater than"+n1);
		}
	}
}
