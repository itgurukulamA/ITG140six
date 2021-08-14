package Stringprograms;
import java.util.*;

public class Firstletterofeachword {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		s=s.trim();
		char ch[]=s.toCharArray();
		boolean n=true;
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isLetter(ch[i])) {
				if(n) {
					ch[i]=Character.toUpperCase(ch[i]);
					n=false;
				}
			}
			else {
				n=true;
			}
		}
		System.out.print(String.valueOf(ch));
		
	}

}
