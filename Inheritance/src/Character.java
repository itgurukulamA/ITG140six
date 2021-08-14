import java.util.*;
public class Character {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		char c=obj.next().charAt(0);
		if(c>='A' && c<='Z') {
			System.out.println("it is upper Case");
			
		}
		else if (c>='a' && c<='z') {
			System.out.println("it is Lower case");
		}
		else if(c>='0' && c<='9') {
			System.out.println("it is Digit");
		}
		else {
			System.out.println("it is special digit");
		}
	}

}
