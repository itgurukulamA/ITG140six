import java.util.Scanner;
public class Average {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		
		int a[]=new  int[10];
		int avg=0;
		int big=0;
		int small=1000;
		for(int i=0;i<10;i++) {
			a[i]=obj.nextInt();
		}
		small=a[0];
		for(int i=0;i<10;i++) {
			avg=avg+a[i];
			if(big<a[i]) {
				big=a[i];
			}
			
			if(a[i]<small) {
				small=a[i];
			}
			
		}
		System.out.println("Average="+avg/10+"\nBig\n"+big+"\nSmall="+small);
		
		
		
	}

}
