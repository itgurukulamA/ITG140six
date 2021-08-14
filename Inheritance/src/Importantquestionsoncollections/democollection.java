package Importantquestionsoncollections;
import java.util.*;
//static class A{
//    void add() {
//    	System.out.println("hello");
//    }
//}
//class B extends A{
// void add() {
//		
//	}
//}
public class democollection {
	private static final String VM = null;

	public static void main(String args[]) {
		
		Character ch1='a';
		
		String s1=new String("raj");
		String s2=s1.intern();
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(ch1);
		System.out.println(s1==s2);
		//System.out.println(VM.current().addressOf(s1));
//		ArrayList al=new ArrayList();
//		al.add(1);
//		al.add(2);
//		al.add(1,20);
//		al.add(40);
//		System.out.println(al);
//		ArrayList b=new ArrayList();
//		b.add(1);
//		b.add(2);
//		b.add(1,20);
//		b.add(40);
//		ArrayList c=new ArrayList();
//		c.addAll(0,b);
//		System.out.println(c);
//		System.out.println(b);
//		al.remove(1);
//		System.out.println(al);
//		b.add(30);
//		b.retainAll(al);
		
		
		
	}
}
