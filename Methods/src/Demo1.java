
public class Demo1 {
String checkNumber(int n) {
	 
	if(n%2==0) 
		return n +" is Even No";
	
	else 
		return n +" is Odd No";
	
}
public static void main(String []a) {
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.println("Enter First Number");
int no = input.nextInt();
Demo1 centum = new Demo1();
System.out.println(centum.checkNumber(no));
}
}