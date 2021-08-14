package Maps;
import java.util.*;
public class Exampaper {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1,"C Language was developed by");
		obj.put(2,"Java Wad developed by");
		obj.put(3,"Python was developed by");
		obj.put(4,"Perl Stand for");
		obj.put(5,"Nodejs was developed by");
		LinkedHashMap obj1=new LinkedHashMap();
		obj1.put(1, "GuidovanRossum");
		obj1.put(2, "Dennis Ritchie");
		obj1.put(3, "Bjarne stoustrup");
		obj1.put(4,"None of the above");
		LinkedHashMap obj2=new LinkedHashMap();
		obj2.put(1,"James Gosling");
		obj2.put(2,"dennis ritchie");
		obj2.put(3, "Robert");
		obj2.put(4,"None of the above");
		LinkedHashMap obj3=new LinkedHashMap();
		obj3.put(1,"James Gosling");
		obj3.put(2,"Guido van Rossum");
		obj3.put(3, "Robert");
		obj3.put(4,"Nicholas");
		LinkedHashMap obj4=new LinkedHashMap();
		obj4.put(1,"Practical Extraction and presentation Language");
		obj4.put(2,"Practical Extraction and Reporting Language");
		obj4.put(3, "Practical Extraction and Reasoning Language");
		obj4.put(4,"Practical Example and Resoning Language");
		LinkedHashMap obj5=new LinkedHashMap();
		obj5.put(1,"James Gosling");
		obj5.put(2,"ryan dhal");
		obj5.put(3, "Bjarne Stoustrup");
		obj5.put(4,"None of the above");
		LinkedHashMap obj6=new LinkedHashMap();
		obj6.put(1,2);
		obj6.put(2, 1);
		obj6.put(3, 2);
		obj6.put(4, 2);
		obj6.put(5, 2);
		Set s=obj.entrySet();
		Iterator k=s.iterator();
		Set s1;
		Iterator i;
		while(k.hasNext()) {
			
			Map.Entry j=(Map.Entry)k.next();
			int m=(int) j.getKey();
			if(m==1) {
				System.out.println(j.getValue());
				s1=obj1.entrySet();
				i=s1.iterator();
				while(i.hasNext()) {
					Map.Entry e=(Map.Entry) i.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
			}
			else if(m==2) {
				System.out.println(j.getValue());
				s1=obj2.entrySet();
				i=s1.iterator();
				while(i.hasNext()) {
					Map.Entry e=(Map.Entry) i.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
			}
			else if(m==3) {
				System.out.println(j.getValue());
				
				s1=obj3.entrySet();
				i=s1.iterator();
				while(i.hasNext()) {
					Map.Entry e=(Map.Entry) i.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
			}
			else if(m==4) {
				System.out.println(j.getValue());
				
				s1=obj4.entrySet();
				i=s1.iterator();
				while(i.hasNext()) {
					Map.Entry e=(Map.Entry) i.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
			}
			else {
				System.out.println(j.getValue());
				
				s1=obj5.entrySet();
				i=s1.iterator();
				while(i.hasNext()) {
					Map.Entry e=(Map.Entry) i.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
			
			}
			System.out.println("Enter your Answer");
			int val=sc.nextInt();
			s=obj6.entrySet();
			i=s.iterator();
			while(i.hasNext()) {
				Map.Entry me=(Map.Entry) i.next();
				if(me.getKey()==j.getKey()) {
					if((int)me.getValue()==val) {
						count++;
					}
				}
			}
		}
		System.out.println("Correct Answers="+count);
		System.out.println("Wrong Answes="+(5-count));
		System.out.println("percenteage Scored"+((count/5.0)*100));
	}

}
