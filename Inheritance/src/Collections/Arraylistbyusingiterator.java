package Collections;
import java.util.*;
public class Arraylistbyusingiterator {
	public static void main(String args[]) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		Iterator obj1=obj.iterator();
		while(obj1.hasNext()) {
			System.out.println(obj1.next());
		}
		
	} 

}
