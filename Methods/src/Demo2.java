
public class Demo2 {
	boolean checkNumber(int n) {
		 
		if(n%2==0) 
			return true;
		
		else 
			return false;
		
	}
public static void main(String[]args) {
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.println("Enter First Number");
int no = input.nextInt();	
Demo2 centum = new Demo2();
if(centum.checkNumber(no)) 
	System.out.println("Even no");
else
	System.out.println("Even no");
}
}
