package DesignPatterns;

interface Shape{
	void draw();
}
class Roundedrectangle implements Shape{
	public void draw() {
		System.out.println("Rounded Rectangle Class");
	}
}
class RoundedSquare implements Shape{
	public void draw() {
		System.out.println("Rounded Square class");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Rectangle Class");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Square class");
	}
}
abstract class  AbstractFactory1{
	abstract Shape getShape(String shape);
}
class Shapefactory extends AbstractFactory1{
	public Shape getShape(String s) {
		if(s.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(s.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}
}
class Roundedshapefactory extends AbstractFactory1{
	public Shape getShape(String s) {
		if(s.equalsIgnoreCase("Reactangle")) {
			return new Roundedrectangle();
		}
		else if(s.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}
		else {
			return null;
		}
	}
}
class FactoryProducer{
	public static AbstractFactory1 getFactory(boolean r) {
		if(r) {
			return new Shapefactory();
		}
		else {
		    return new Roundedshapefactory();
		}
	}
}
public class AbstractFactory {
public static void main(String args[]) {
	AbstractFactory1 obj=FactoryProducer.getFactory(false);
	Shape obj1=obj.getShape("square");
	obj1.draw();
	obj1=obj.getShape("reactangle");
	obj1.draw();
}
	

}
