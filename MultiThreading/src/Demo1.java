

public class Demo1
	{
		public static void main(String[] args) 
		{
			System.out.println("Main Method");
			MyThread1 thread1=new MyThread1();
			MyThread2 thread2=new MyThread2();
			
			thread1.start();//runnable
			thread2.start();
		}
}
