package Maps;
import java.util.*;

public class Linkedhashmap {
	public static void main(String args[]) {
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1, "Rajesh");
		//obj.put(2, "Ramesh");
		obj.put(3, "suresh");
		obj.put(2,"Sukumar");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry) i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
