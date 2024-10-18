
public class Demo5
{
 public static void main(String[] args) {
	MyThread my1 = new MyThread();
	MyThread my2 = new MyThread();
	MyThread my3 = new MyThread();
	
	my1.start();
	try
	{
		my1.join();
		
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	my2.start();
	my3.start();
	
}
}
