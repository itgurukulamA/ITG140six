import java.util.Scanner;
public class EvennumberuptoN {
	public static void main(String rags[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		sum=0;
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
		sum=0;
		i=1;
		do {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}while(i<=n);
		System.out.println(sum);

		
		
	}

}
