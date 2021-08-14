import java.util.Scanner;
public class multiplicationtable1to10 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		for(int i=1;i<10;i++) {
			for(int j=1;j<=12;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
