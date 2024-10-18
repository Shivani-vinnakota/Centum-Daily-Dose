package uncheckedException;

public class Demo4 
{
 public static void A() throws ClassNotFoundException
 {
	 System.out.println("A");
	 throw new ClassNotFoundException();
 }
 public static void B()throws ClassNotFoundException
 {
	 System.out.println("B");
	 A();
 }
 public static void C()throws ClassNotFoundException
 {
	 System.out.println("C");
	 B();
 }
 public static void main(String[] args) {
	System.out.println("main");
	try {
		C();
	}
	catch(ClassNotFoundException e) {
		System.out.println(e);
	}
}
}
