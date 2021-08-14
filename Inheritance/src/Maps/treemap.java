package Maps;
import java.util.*;
public class treemap {
	public static void main(String args[]) {
		TreeMap obj=new TreeMap();
		obj.put(2, "Rajesh");
		obj.put(5,"sai");
		obj.put(3,"Kumar");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry j=(Map.Entry)i.next();
			System.out.println(j.getKey()+" "+j.getValue());
		}
		
	}
}
