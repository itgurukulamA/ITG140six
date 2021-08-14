package Stringprograms;
import java.util.*;
public class Occuranceofcharacter {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			int val=0;
			/*for(int i1=0;i1<c.length;i1++) {
				if(c[i1]==s.charAt(i1)) {
					val=1;
					break;
				}
				
			}*/
			if(val==1)
			{
			}
			else {
			System.out.println(s.charAt(i)+" "+count);
			c[i]=s.charAt(i);			
			
			}
			}
			
		}
		
	}


