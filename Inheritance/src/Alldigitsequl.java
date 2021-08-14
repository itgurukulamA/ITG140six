import java.util.Scanner;
public class Alldigitsequl {
	public static void main(String args[]) {
		Scanner obj= new Scanner(System.in);
		int n=obj.nextInt();
		int g=n%10;
		int flag=0;
		
		
		while(n>0) {
			int r=n%10;
			if(r!=g) {
				flag=1;
			}
			n=n/10;
		}
		if(flag==1) {
			System.out.println("digits are not equal");
		}
		else {
			System.out.print("digits  are equal");
		}
	}

}
