import java.util.*;
public class Numberofdigits {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int count=0;
		while(n>0) {
			int r=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
