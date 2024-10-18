
public class Demo1 {
public static void main(String[] args)
{
	Test1 t1 = Test1.getTest();
	Test1 t2 = Test1.getTest();
	Test1 t3 = Test1.getTest();
	
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	
	Test1.getTest().show();
	
}
}
