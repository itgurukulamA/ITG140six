import java.util.Scanner;
public class Multiplicationtable {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+"1"+"="+n*i);
		}
	}
}
