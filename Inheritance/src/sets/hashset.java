package sets;

import java.util.*;
public class hashset {
	public static void main(String args[]) {
		Set obj=new HashSet();
		obj.add(1);
		obj.add(2);
		obj.add(1);
		obj.add(4);
		obj.add('a');
		obj.add(8);
		obj.add("t");
		obj.add(6);
		obj.add(" ");
		obj.add(3);
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
