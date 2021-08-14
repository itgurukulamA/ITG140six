import java.util.Scanner;
public class Coordinate {
	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		int y=obj.nextInt();
		if(x==0 && y==0) {
			System.out.println(" The point Lies in Origin");
		}
		else if(x==0 && y!=0) {
			System.out.println(" The point lies in Y-axis");
		}
		else if(x!=0 && y==0){
			System.out.println("The point lies in X-axis");
		}
		else {
			System.out.println("the poinrt doesnot lies on x-axis or y-axis");
		}
	}

}
