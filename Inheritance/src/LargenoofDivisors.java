import java.util.*;
public class LargenoofDivisors {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int fact=1;
		int fact2=1;
		int val=0;
		for(int i=1;i<=10000;i++) {
			fact=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					fact++;
				}
			}
			System.out.println(fact);
			if(fact>fact2) {
				val=i;
				fact2=fact;
			}
			
			
		}
		System.out.println(val);
	}

}
