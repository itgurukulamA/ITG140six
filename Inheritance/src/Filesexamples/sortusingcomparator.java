package Filesexamples;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee23 {
	String name;
	int id;
	Employee23(String name,int id ){
		this.name=name;
		this.id=id;
	}
}
class Firstnamesorter implements Comparator<Employee23>{
	  public int compare(Employee23 o1,Employee23 o2) {
		return o1.name.compareTo(o2.name);
	}
}
public class sortusingcomparator {
	public static void main(String[] args) {
		Employee23 obj=new Employee23("Raju",101);
		Employee23 obj2=new Employee23("Ramu",102);
		ArrayList<Employee23> al=new ArrayList<>();
		al.add(obj);
		al.add(obj2);
		Collections.sort(al,new Firstnamesorter());
		System.out.println(al);
		
	}
	

}
