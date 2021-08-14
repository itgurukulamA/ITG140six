package Stringprograms;
import java.util.*;
public class Stringinreversewordbyword {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		int m=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ') {
				for(int j=i-1;j>=m;j--) {
					System.out.print(s.charAt(j));
					
				}
				System.out.print(" ");
				m=i+1;
			}
			
		}
		for(int i=s.length()-1;i>=m;i--) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
