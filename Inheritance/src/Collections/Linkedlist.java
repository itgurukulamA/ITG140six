package Collections;
import java.util.*;
public class Linkedlist {
	public static void main(String args[]) {
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		l.remove();
		System.out.println(l);
		l.removeAll(l);
		System.out.println(l);
		
	}
}
