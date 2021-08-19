package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		List <String> l1=new ArrayList<>();
		List <String> l2=new LinkedList<>();
		l1.add("miracle");
	    l1.add("software");
	    l1.add("systems");
	    l2.add("hi");
	    l2.add("hello");
	    l2.add("welcome");
	    Iterator i1=l1.iterator();
	    Iterator i2=l2.iterator();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("1.ArrayList");
	    System.out.println("2.LinkedList");
	    int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	    break;
	    case 2:
	    while(i2.hasNext())
	    {
	    	System.out.println(i2.next());
	    }
	    break;
	}

}
}
