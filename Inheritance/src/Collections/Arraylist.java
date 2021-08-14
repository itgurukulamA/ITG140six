package Collections;
import java.util.*;
public class Arraylist {
	public static void main(String args[]) {
	    ArrayList<Integer> obj=new ArrayList<Integer>();
	    obj.add(1);
	    obj.add(2);
	    obj.add(3);
	    obj.add(1,4);
	    ArrayList obj2=new ArrayList();
	    obj2.addAll(obj);
	    System.out.println(obj2);
	    obj2.add(5);
	    obj2.add(9);
	    obj2.removeAll(obj);
	    System.out.println(obj2);
	    System.out.println(obj);
	}

}
