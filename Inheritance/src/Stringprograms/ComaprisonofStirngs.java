package Stringprograms;
import java.util.*;
public class ComaprisonofStirngs {
	int Compare(String s1,String s2) {
		int count=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					return count;
				}
			}
			count=1;
			return count;
			
		}
		else {
			return count;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		String s1=obj.next();
		ComaprisonofStirngs obj1=new ComaprisonofStirngs();
		int c=obj1.Compare(s,s1);
		if(c==0) {
			System.out.println("Strings are not equal");
		}
		else {
			System.out.println("Strings are equal ");
		}
		

	}

}
