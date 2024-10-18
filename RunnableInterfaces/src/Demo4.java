
public class Demo4 
{
 public static void main(String[] args) 
 {
	MyThread4 my1 = new MyThread4();
	MyThread4 my2 = new MyThread4();
	
	my1.start();
	my2.start();
}
}
