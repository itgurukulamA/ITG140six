package sets;
import java.util.*;
public class conversionlisttose {
	public static void main(String args[]) {
		ArrayList<Integer> obj=new ArrayList();
		obj.add(2);
		obj.add(2);
		obj.add(6);
		obj.add(1);
		HashSet obj1=new HashSet();
		System.out.println(obj);
		obj1.addAll(obj);
		System.out.println(obj1);
		System.out.println(obj);

		obj.remove(1);
		System.out.println(obj);
		obj.retainAll(obj);
		obj.clear();
		System.out.println(obj);
		obj.retainAll(obj);
		System.out.println(obj);
		
	}

}
