package Threads;

public class ThreadExample2 extends Thread
{
 public void run() 
 {
	 for(int i=0;i<=10;i++)
	 {
		 System.out.println(i);
	 }
 }
 public static void main(String[] args) 
 {
  ThreadExample2 obj = new ThreadExample2();
  ThreadExample2 obj1 = new ThreadExample2();
  Thread t = new Thread(obj);	
  Thread t1 = new Thread(obj1);	
  t.start();
  t1.start();
 }
}
