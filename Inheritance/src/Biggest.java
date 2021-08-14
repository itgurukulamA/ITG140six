import java.util.*;
public class Biggest {

	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		if(n1>n2) {
			System.out.println(n1+"is bigger than "+n2);
		}
		else {
			System.out.println(n2+"is bigger than "+n1);
		}
		
	}
}
