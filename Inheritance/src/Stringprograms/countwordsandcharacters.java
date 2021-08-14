package Stringprograms;
import java.util.*;

public class countwordsandcharacters {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=obj.nextLine();
		int words=0;
		int characters=1;
		int j=1;
		for (int i=0;i<s.length();i++) {
			if(((i>0)&&s.charAt(i)==' ' && s.charAt(i-1)!=' ')||(i==0 && s.charAt(i)!=' '))  {
				words++;
			}
			else{
			if(s.charAt(i)!=' ')
					characters++;
			}
			
		}
		System.out.println(words+" "+characters);
	}

}
