
public class Demo1 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("Parent Thread");
	System.out.println(Thread.currentThread().getName());
	
	MyThread1 my1 = new MyThread1();
	MyThread1 my2 = new MyThread1();
	
	my1.setName("Child Thread1");
	my1.setName("Child Thread2");
	
	my1.start();
	my2.start();
}
}
