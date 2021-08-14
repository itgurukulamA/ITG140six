import java.util.*;
public class perfectnumber {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
	if(sum==n) {
		System.out.println("it is perfect number");
	}
	else {
		System.out.println("/\bit is not a perfect number");
	}
		
	}

}
