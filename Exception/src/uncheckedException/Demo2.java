package uncheckedException;

public class Demo2 {
	public static void A() {
		System.out.println("A");
		throw new ClassNotFoundException();
	}
	public static void B()
	{
		System.out.println("B");
		A();
	}
	public static void main(String a[])
	{
		System.out.println("main");
		try {
			B();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
