
public class MyThread5 extends Thread
{
  public void run()
  {
	  System.out.println(Thread.currentThread().getName());
	  try
	  {
		  Thread.sleep(5000);
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println("Iam interrpted");
	  }
  }
}
