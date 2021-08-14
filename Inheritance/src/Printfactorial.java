import java.util.Scanner;
public class Printfactorial {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int x=obj.nextInt();
		float sum=1;
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				
					fact*=j;
				
			}
			sum=sum+((float)Math.pow(x, i)/fact);
		}
		System.out.println(sum);
	}

}
