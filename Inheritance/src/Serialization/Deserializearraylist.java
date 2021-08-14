package Serialization;
import java.io.*;
import java.util.*;
public class Deserializearraylist {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		try {
		FileInputStream fis=new FileInputStream("alobj.txt");
		ObjectInputStream ois1=new ObjectInputStream(fis);
	//	ArrayList<demo1> obj1=new ArrayList<demo1>();
		 ArrayList al= (ArrayList)ois1.readObject();	
		 //System.out.println(d.id);
			
			  Iterator i=al.iterator(); 
			  while(i.hasNext())
			  { 
			 System.out.println(i.next());
			 // System.out.println(d.id); }
		
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
