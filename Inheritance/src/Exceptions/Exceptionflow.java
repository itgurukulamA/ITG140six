package Exceptions;
import java.io.IOException;;
public class Exceptionflow {
	  void m()throws IOException{
	    throw new IOException("device error");//checked exception
	  }
	  void n()throws IOException{
	    m();
	  }
	  void p(){
	   try{
	    n();
	   }catch(IOException e){System.out.println(e);}
	  }
	  public static void main(String args[]){
	   Exceptionflow obj=new Exceptionflow();
	   obj.p();
	   System.out.println("normal flow...");
	  }
	

}
