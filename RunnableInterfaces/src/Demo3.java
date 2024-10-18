
public class Demo3 
{
public static void main(String[] args) 
{
	System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	
	MyThread3 my1 = new MyThread3();
	MyThread3 my2 = new MyThread3();
	MyThread3 my3 = new MyThread3();
	
	System.out.println(my1.getPriority());
	System.out.println(my2.getPriority());
	System.out.println(my3.getPriority());
	
	my1.setPriority(Thread.MIN_PRIORITY);
	System.out.println(my1.getPriority());
	
	my3.setPriority(7);
	System.out.println(my3.getPriority() );
	
}
}
