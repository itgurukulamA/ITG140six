package Collections;
import java.util.*;
public class listiterator {
	public static void main(String args[]) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(1);
		obj.add(2);
		ListIterator li=obj.listIterator(obj.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
	}

}