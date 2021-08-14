package Stringprograms;
import java.util.*;
public class FindingLength {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		char ch[]=s.toCharArray();
		ch[ch.length-1]='\0';
		int count=1;
		for(int i=0;ch[i]!='\0';i++) {
			count++;
		}
		System.out.println(count);
		
		
	}

}
