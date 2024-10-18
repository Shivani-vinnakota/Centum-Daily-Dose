//static ,non-static in same class
public class Demo {
void printValue() {
	System.out.println("Hello");
}
static void displayValue() {
	System.out.println("Bye");
}
public static void main(String[]args) {
	System.out.println("Demo class");
	Demo d = new Demo();
	d.printValue();
	displayValue();
}
}
