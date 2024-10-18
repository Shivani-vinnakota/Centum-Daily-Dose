
public class Demo {
int add() {
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.println("Enter First Number");
	int no1 = input.nextInt();
	System.out.println("Enter Second Number");
	int no2 = input.nextInt();
	int sum = no1+no2;
	return sum;
}
public static void main(String[]a) {
	Demo demo = new Demo();
	int result = demo.add();
	System.out.println("Sum = "+result);
	System.out.println(demo.add());
	System.out.println("Addition = "+demo.add());
}
}
