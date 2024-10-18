
public class MyThread4  extends Thread
{
 public void run()
 {
	 for(int i=1;i<=5;i++)
	 {
	 System.out.println(Thread.currentThread().getName());
	 try 
	 {
		 Thread.sleep(2000);
	 }
	 catch(InterruptedException e)
	 {
		 System.out.println(e);
	 }
 }
}
}
