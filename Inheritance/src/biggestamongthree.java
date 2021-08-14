import java.util.Scanner;
public class biggestamongthree {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int n2=obj.nextInt();
		int n3=obj.nextInt();
		int big=(n>n2 && n>n3)?1:(n2>n && n2>n3)?2:0;
		if(big==1) {
			System.out.println(n+"is big");
		}
		else if(big==2) {
			System.out.println(n2+"is big");
		}
		else {
			System.out.println(n3+" is big");
		}
	}
}
