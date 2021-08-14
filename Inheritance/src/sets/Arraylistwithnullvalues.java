package sets;
import java.util.*;
public class Arraylistwithnullvalues {
	public static void main(String args[]){
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(' ');
		obj.add(null);
		obj.add("Rajesh");
		obj.add(null);
		System.out.println(obj);	
		
	}
}
