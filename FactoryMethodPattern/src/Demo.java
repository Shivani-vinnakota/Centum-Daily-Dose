
public class Demo 
{
 public static void main(String[] args) 
 {
	Test t1 = Test.getTest();
	t1.show();
	System.out.println(t1.display());
	Test.getTest().show();
	System.out.println(Test.getTest().display());
}
}
