package DesignPatterns;

public class Singletondesipat {
	static Singletondesipat obj=null;
	int a=10;
	private Singletondesipat() {
		System.out.println("Constructor");
	}
	public static Singletondesipat getInstance() {
		if(obj==null) {
			obj=new Singletondesipat();
			return obj;
		}
		return obj;
		
	}
	public static void main(String arg[]) {
		Singletondesipat obj1=Singletondesipat.getInstance();
		Singletondesipat obj2=Singletondesipat.getInstance();
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		System.out.println(obj1.a);
		obj1.a=20;
		System.out.println(obj2.a);
		
		
	}
}
