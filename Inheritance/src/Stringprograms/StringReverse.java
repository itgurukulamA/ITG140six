package Stringprograms;
import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
