
public class Demo {
static void show() {
	try {
		System.out.println("Show Start");
		int div = 10/0;
		System.out.println("Result = "+div);
		System.out.println("Show End");
	}
	catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("Divisor Cannot be zero");		
	}
}
public static void main(String []args) {
	System.out.println("Main Start");
	show();
	System.out.println("Main End");
}
}
