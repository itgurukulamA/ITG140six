package Threads;

public class ThreadExample implements Runnable
{
 public synchronized void run() 
 {
 try 
 {
 for(int i=0;i<=10;i++)
 {
	 System.out.println(i);
	 Thread.sleep(1000);
	 System.out.println("waiting");
 }
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 }
 public static void main(String[] args) 
 {
  ThreadExample obj = new ThreadExample();
  ThreadExample obj1 = new ThreadExample();
  Thread t = new Thread(obj);	
  Thread t1 = new Thread(obj1);	
  t.start();
  t1.start();
  System.out.println(t.getName());
  System.out.println(t1.getName());
  System.out.println(t.isAlive());
  System.out.println(t.getPriority());
}
}