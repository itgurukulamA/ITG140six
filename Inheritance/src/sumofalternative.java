import java.util.*;
public class sumofalternative {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		int asum=0;
		int s=1;
		while(n>0) {
			int r=n%10;
			if(s==1) {
				sum+=r;
				s=0;
			}
			else {
				asum+=r;
				s=1;
			}
			n=n/10;
		}
		System.out.println(sum+" "+asum);
		
	}

}
