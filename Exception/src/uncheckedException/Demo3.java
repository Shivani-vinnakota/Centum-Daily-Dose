package uncheckedException;

public class Demo3 {
public static void A() {
	System.out.println("A");
	try
	{
		throw new ClassNotFoundException();
	}
	catch(ClassNotFoundException e) {
		System.out.println(e);
	}
 }
   public static void B()
   {
	System.out.println("B");
	A();
   }
   public static void C()
   {
	System.out.println("C");
	B();
  }
    public static void main(String a[]) 
    {
	System.out.println("main");
    }
}
