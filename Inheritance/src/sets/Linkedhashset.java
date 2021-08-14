package sets;
import java.util.*;
public class Linkedhashset {
	public static void main(String args[]) {
		LinkedHashSet obj=new LinkedHashSet();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		LinkedHashSet obj1=new LinkedHashSet(obj);
		System.out.println(obj.addAll(obj1));
		obj1.add(22);
		obj.addAll(obj1);
		System.out.println(obj);
		obj.add(20);
		obj.add(90);
		obj.retainAll(obj1);
		
		System.out.println(obj);
		obj.add(90);
		obj1.add(30);
		obj.removeAll(obj1);
		System.out.println(obj);
		
	}

}
