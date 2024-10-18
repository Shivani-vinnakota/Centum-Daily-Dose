
public class Demo2 {
public static void main(String[] args) 
{
	System.out.println("Main Method");
	MyThread1 thread1 = new MyThread1();
	MyThread2 thread2 = new MyThread2();
	thread1.run();
	thread2.run();
	
}
}
