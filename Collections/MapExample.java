package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExample {
 public static void main(String[] args) 
 {
	Map<Integer,String> map=new HashMap<Integer,String>();
	Map<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
    Map<String,String> map2=new TreeMap<String,String>();
	map.put(3,"Ramesh");
	map.put(1,"Chaithu");
	map.put(2,"Laxman");
	map1.put(1,100);
	map1.put(2,101);
	map1.put(3,102);
	map2.put("miracle", null);
	map2.put("software",null);
	map2.put("systems", null);
    Scanner sc=new Scanner(System.in);
	System.out.println("1.HashMap");
	System.out.println("2.LinkedHashMap");
	System.out.println("3.TreeMap");
	int ch=sc.nextInt();
    switch(ch)
    {
    case 1:
	for(Map.Entry m: map.entrySet())
	{
		System.out.println(m.getKey()+" "+ m.getValue());
	}
	break;
    case 2:
    for(Map.Entry m1: map1.entrySet())
    {
    	System.out.println(m1.getKey()+" "+ m1.getValue());
    }
    break;
    case 3:
    for(Map.Entry m2: map2.entrySet())
    {
    	System.out.println(m2.getKey()+" "+ m2.getValue());
    }
    break;
 }
}
}
