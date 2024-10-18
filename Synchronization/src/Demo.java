
public class Demo 
{
public static void main(String[] args)
{
	Message msg = new Message();
	MyThread1 my1 = new MyThread1(msg);
	MyThread2 my2 = new MyThread2(msg );
	
	my1.start();
	my2.start();
			
}
}
