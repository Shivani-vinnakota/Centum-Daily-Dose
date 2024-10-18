
public class Demo {
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		MyThread thread1 = new MyThread();
		thread1.start();
	}
}
