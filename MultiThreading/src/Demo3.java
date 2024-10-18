
public class Demo3 {
public static void main(String[] args) {
	System.out.println("Main Method");
	MyThread1 thread1 = new MyThread1();
	
	thread1.start();
	thread1.start();//IllegalThreadStateException
}
}
