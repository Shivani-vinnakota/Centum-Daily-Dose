package InnerThread;

public class MyThread1 extends Thread
{
 Customer cust;
 MyThread1(Customer cust)
 {
	 this.cust=cust;
 }
 public void run()
 {
	 cust.withdraw(4000);
 }
}
