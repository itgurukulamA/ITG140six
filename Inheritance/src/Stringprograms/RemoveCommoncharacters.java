package Stringprograms;
import java.util.*;

public class RemoveCommoncharacters {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		String s2=obj.next();
		String common="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s.charAt(i)==s2.charAt(j)) {
					common=common+String.valueOf(s.charAt(i));
				}
			}
		}
		
		for(int j=0;j<common.length();j++) {
			String s3=String.valueOf(common.charAt(j));
			
			s=s.replace(s3,"");
			s2=s2.replace(s3, "");
		}
		System.out.println(s);
		System.out.println(s2);
				
	}

}
