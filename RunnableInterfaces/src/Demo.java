
public class Demo 
{
public static void main(String[] args)
{
	MyThread my1 = new MyThread();
	MyThread my2 = new MyThread();
	
	Thread thread = new Thread();
	thread.start();
	
	Thread thread1 = new Thread(my1);
	Thread thread2 = new Thread(my2);
	
	thread1.start();
	thread2.start();
}
}
