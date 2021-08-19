package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set <String> s1=new HashSet<>();
		Set <String> s2=new LinkedHashSet<>();
		Set <Integer> s3=new TreeSet<>();
		s1.add("miracle");
	    s1.add("amazon");
	    s1.add("google");
	    s1.add("miracle");
	    s1.add("apple");
	    s1.add("ibm");
	    s2.add("white");
	    s2.add("black");
	    s2.add("pink");
	    s2.add("blue");
	    s2.add("red");
	    s2.add("green");
	    s3.add(4);
	    s3.add(2);
	    s3.add(3);
	    Iterator i1=s1.iterator();
	    Iterator i2=s2.iterator();
	    Iterator i3=s3.iterator();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("1.HashSet");
	    System.out.println("2.LinkedHashSet");
	    System.out.println("3.TreeSet");
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
	    case 3:
	    	while(i3.hasNext())
	    	{
	    		System.out.println(i3.next());
	    	}
	    	break;
	}

}
}
