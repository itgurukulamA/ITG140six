import java.util.Scanner;
public class Divisibleby3and5 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("it is divisible by 3 and 5");
			
		}
		else {
			System.out.println("it is not divisible by 3 and 5");
		}
		
	}
}
