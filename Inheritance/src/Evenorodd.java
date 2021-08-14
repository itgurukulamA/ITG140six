import java.util.Scanner;
public class Evenorodd {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n%2==0) {
			System.out.println(n+"is Even number");

		}
		else {
			System.out.println("it is a odd number");
		}
	}

}
