package sets;
import java.util.*;
public class Stringbuuffer {
	public static void main(String arga[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=obj.next();
		 StringBuffer s1=new StringBuffer(s);
		 s1.append(s);s1.append(s);s1.append(s);s1.append(s);s1.append(s);
		 System.out.println(s1);
		 System.out.println(s1.length());
		 System.out.println(s1.capacity());
		 System.out.println(s.length());
		 	 
	}

}



