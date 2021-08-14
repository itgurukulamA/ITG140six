import java.util.Scanner;
public class printsumupto2poern {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		float sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum+(1.0f/(float)(Math.pow(i, 2)));
			
		}
		System.out.println(sum);
	}
}
