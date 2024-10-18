//without datahiding
public class Calculator2 {
	int no1=10,no2=2;
	public void add() {
		System.out.println("Add = "+(no1+no2));
	}
	public void sub() {
		System.out.println("Sub = "+(no1-no2));
	}
}
class Users{
	public static void main(String[]args) {
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		System.out.println("Multiply "+(calc.no1*calc.no2));
		System.out.println("div "+(calc.no1/calc. no2));
	 }	
}
 


