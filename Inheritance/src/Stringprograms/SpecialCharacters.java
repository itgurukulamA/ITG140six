package Stringprograms;
import java.util.*;
public class SpecialCharacters {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
