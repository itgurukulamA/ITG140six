import java.util.*;
public class Numberofoccurances {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int n1=obj.nextInt();
		int count=0;
		while(n>0) {
			int r=n%10;
			if(r==n1) {
				count++;
			}
			n=n/10;
		}
		System.out.println("/"+count);
	}
}
