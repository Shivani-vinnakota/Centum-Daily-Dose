package uncheckedException;

public class Demo1 
{ public static void A() {
	System.out.println("A");
	int div = 10/0;
}
public static void B() {
	System.out.println("B");
	A();
}
public static void main(String a[]) {
	System.out.println("main");
	try {
		B();
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}

}
