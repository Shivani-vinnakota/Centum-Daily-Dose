//static ,non-static in different class
public class Demo1 {
	void printValue() {
		System.out.println("Hey....");
	}
	static void displayValue() {
		System.out.println("Bye");
	}
}
class User{
public static void main(String[]args) {
		System.out.println("Demo class");
		Demo1 d = new Demo1();
		d.printValue();
		Demo1.displayValue();//d.displayValue();
	}
}