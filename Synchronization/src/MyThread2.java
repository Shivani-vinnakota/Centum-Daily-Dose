
public class MyThread2 extends Thread
{
  Message msg;
  MyThread2(Message msg)
  {
	  this.msg = msg;
  }
  public void run()
  {
	  msg.printMsg("Bye");
  }
}
