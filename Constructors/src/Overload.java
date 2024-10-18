// Constructor overloading
public class Overload {
	Overload(String msg){
		System.out.println("String Parameterised Constructor " +msg);
	}
	Overload(int msg){
		System.out.println("Int Parameterised Constructor " +msg);
	}
	Overload(){
		System.out.println("Non-argumented Constructor");
	}
public static void main(String[]args) {
	Overload s = new Overload();
	Overload s2 = new Overload(20);
	Overload s3 = new Overload("Hello Students");
}
}
