package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) 
	{
    List <String> l1=new ArrayList<>();
    l1.add("miracle");
    l1.add("software");
    l1.add("hi");
    System.out.println(l1);
    List<String> l2=new ArrayList<>();
    l2.add("hi");
    l2.add("hello");
    l2.add("welcome");
    System.out.println(l2);
    l1.addAll(l2);
    System.out.println(l1);
    l2.remove(0);
    System.out.println(l2);
    l2.add(0,"hi");
    System.out.println(l2);
    System.out.println(l2.get(0));
    System.out.println(l1.get(0));
    l2.set(1, "hi");
    System.out.println(l2);
     l1.clear();
     System.out.println(l1);
     Collections.addAll(l2,"to","miracle");
     l1.removeAll(l2);
      System.out.println(l1);
	}

}
