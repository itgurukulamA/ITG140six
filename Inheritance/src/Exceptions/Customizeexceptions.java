package Exceptions;
import java.util.*;
class demo extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	demo(String s){
		super(s);
	}
}
public class Customizeexceptions{
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		try {
			if(n<18) {
				throw new demo("Age must be greater than 18");
			}
			else {
				System.out.println("valid member apply for vote");
			}
		}
		catch(demo  g) {
			System.out.println(g);
		}
	}

}
