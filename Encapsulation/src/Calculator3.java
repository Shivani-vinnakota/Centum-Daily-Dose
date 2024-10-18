//data hiding
public class Calculator3 {
private	int no1=10,no2=2;
public void add() {
    System.out.println("Add = "+(no1+no2));
}
public void sub() {
	System.out.println("Sub = "+(no1-no2));
}
}
class User{
	public static void main(String[]args) {
		Calculator3 calc = new Calculator3();
		calc.add();
		calc.sub();
		
	 }	
}
 
