
public class Message2 
{
  synchronized static void  printMSg(String msg)
  {
	  for(int i=1;i<=3;i++) {
		  try
		  {
			  System.out.println(msg);
			  Thread.sleep(1000);
		  }
		  catch(Exception e)
		  {
			  
		  }
	  }
  }
}
class MyThread3 extends Thread
{
	
	 Message Message;
	public void run() {
		Message.printMsg("Hello hi");
	}
}
class MyThread4 extends Thread
{
	
	 Message Message;
	public void run() {
		Message.printMsg(" Good Bye");
	}
}
class Demo1
{
	public static void main(String[] args) {
		
		MyThread3 my1 = new MyThread3();
		MyThread4 my2 = new MyThread4();
		
		my1.start();
		my2.start();
	}
}
