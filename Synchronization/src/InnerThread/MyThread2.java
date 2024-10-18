package InnerThread;

public class MyThread2 extends Thread
{
	Customer cust;
	 MyThread2(Customer cust)
	 {
		 this.cust=cust;
	 }
	 public void run()
	 {
		 cust.deposit(5000);
	 }
}
