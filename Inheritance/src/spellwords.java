import java.util.Scanner;
public class spellwords {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int rev=0;
		while(n>0) {
			int r1=n%10;
			rev=rev*10+r1;
			n=n/10;
		}
		while(rev>0) {
			int r=rev%10;
			if(r==0) {
				System.out.println("Zero ");

			}
			else if(r==1) {
				System.out.println("One ");

			}
			else if(r==2) {
				System.out.println(" Two ");

			}
			else if(r==3) {
				System.out.println("Three");

			}
			else if(r==4) {
				System.out.println("Four");

			}
			else if(r==5) {
				System.out.println("Five");

			}
			else if(r==6) {
				System.out.println("Six");

			}
			else if(r==7) {
				System.out.println("Seven");

			}
			else if(r==8) {
				System.out.println("Eight");

			}
			else {
			System.out.println("Nine");
			}
			rev=rev/10;
		}
	}

}
