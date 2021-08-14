import java.util.Scanner;
import java.util.*;
class Single_level_Inheritance{
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number of elements to store in array");
		int no=obj.nextInt();
		int a[]=new int[no];
		
		for(int i=0;i<no;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<no;i++) {
			for( int j=0;j<no-i-1;j++) {
				if(a[j]>a[j+1]) {
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
		}
		
		for(int i=0;i<no;i++) {
			System.out.println(a[i]);
		}
		
		
	}
}