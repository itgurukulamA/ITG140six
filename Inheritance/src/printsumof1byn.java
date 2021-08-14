import java.util.Scanner;
public class printsumof1byn {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(1.0f/i);
			System.out.println(1.0f/i);
		}
		System.out.println(sum);
	}

}
