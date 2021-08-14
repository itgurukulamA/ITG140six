class A{
	void a() {
		System.out.println("A class Method");
	}
	void b() {
		System.out.println("B class method");
	}
}
public class Objectclassmethods extends A {
	void a() {
		System.out.println("Child class method");
	}
	void add() {
		System.out.println("Add method");
	}
	public static void main(String[] args) 
    { 
        A t = new Objectclassmethods(); 
        
        t.a();
    }  
   
}
