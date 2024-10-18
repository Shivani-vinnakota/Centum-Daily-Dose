package InnerThread;

public class Demo 
{
public static void main(String[] args) 
{
	Customer cust = new Customer();
	MyThread1 my1 = new MyThread1(cust);
	MyThread2 my2 = new MyThread2(cust);
	
	my1.start();
	my2.start();
}
}
