package Stringprograms;
import java.util.*;

public class alphabeticalorder {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-i-1;j++) {
				char c2=Character.toUpperCase(ch[j]);
				char c1=Character.toUpperCase(ch[j+1]);
				if(ch[j]>ch[j+1] ||  c2>c1) {
					char c;
					c=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=c;
					
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		for(int i=ch.length -1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	
	}

}
