
public class Demo2 
{
public static void main(String[] args) 
 {
	System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	 
	MyThread my1 = new MyThread();
	MyThread my2 = new MyThread();
	
	my1.start();
	my2.start();
 }

}
