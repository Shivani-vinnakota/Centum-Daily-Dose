//METHOD OVERLOADING-Compile time polymorphism
//No.of parameters
public class Demo {
public void add(int no1,int no2) {
	System.out.println("Add 2 numbers = "+ (no1+no2));
}
public void add(int no1,int no2,int no3) {
	System.out.println("Add 3 numbers = "+ (no1+no2+no3));
}
public void add(int no1,int no2,int no3,int no4) {
	System.out.println("Add 4 numbers = "+ (no1+no2+no3+no4));
}
}
class User{
	public static void main(String[]args) {
		Demo d = new Demo();
		d.add(10,1,2);
		
	}
}