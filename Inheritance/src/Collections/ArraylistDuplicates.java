package Collections;
import java.util.*;
public class ArraylistDuplicates {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(1);
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
