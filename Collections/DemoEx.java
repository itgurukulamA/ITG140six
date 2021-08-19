package Collections;

import java.util.ArrayList;
class Employee
{
	int id;
	String name;
	int age;
    public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class DemoEx 
{
 public static void main(String[] args)
 {
   Employee e1 = new Employee(1,"ramesh",22);
   Employee e2 = new Employee(2,"laxman",25);
   Employee e3= new Employee(3,"dinesh",22);
   ArrayList<Employee> list = new ArrayList<Employee>();
   list.add(e1);
   list.add(e2);    
   list.add(e3);
   System.out.println(list.get(0).id);
   System.out.println(list.get(0).name);
   System.out.println(list.get(0).age);
   System.out.println(list);
	    }
	}

