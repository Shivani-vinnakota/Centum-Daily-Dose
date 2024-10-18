
public class MyThread1 extends Thread
{
   Message msg;
      MyThread1(Message msg)
     {
	 this.msg=msg;
     }
      public void run()
      {
    	 msg.printMsg("Hello"); 
      }
}
