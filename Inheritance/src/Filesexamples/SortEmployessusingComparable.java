package Filesexamples;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee implements Comparable<Employee>{
	String name;
	int id;
	Employee(int id,String name ){
		this.name=name;
		this.id=id;
	}
	 public int compareTo(Employee o) {
		return this.id-o.id;
	}
}
public class SortEmployessusingComparable {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Rajesh");
		Employee e2=new Employee(102,"Ramu");
		Employee e3=new Employee(102,"Ramu");
		Employee e4=new Employee(101,"Rajesh");
		List<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println(emp);
		Collections.sort(emp);
		System.out.println(emp);
	}

}
