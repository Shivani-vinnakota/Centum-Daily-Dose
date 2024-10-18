// where we nrmlly declare class and method
public class Calculator {
int no1=10,no2=2;
public void add() {
	System.out.println("Add = "+(no1+no2));
}
public void sub() {
	System.out.println("Sub = "+(no1-no2));
}
}
class CalculatorApp{
	public static void main(String[]args) {
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
 }
}
