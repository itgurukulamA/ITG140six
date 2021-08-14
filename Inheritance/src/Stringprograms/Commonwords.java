package Stringprograms;
import java.util.*;
public class Commonwords {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		String s2=obj.nextLine();
		String s3[]=s.split(" ");
		String s4[]=s2.split(" ");
		
		for(int i=0;i<s3.length;i++) {
			int count=0;
			for(int j=0;j<s4.length;j++){
				if(s3[i].equals(s4[i])) {
					count=1;
					break;
				}
			}
			if(count==1) {
				System.out.println(s3[i]);
			}
		}
	}

}
