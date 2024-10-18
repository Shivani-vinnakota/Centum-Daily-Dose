package DSA_Day_3_STACK;

import java.util.Scanner;

public class StackApp
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of stack");
	int n = scan.nextInt();
	Stack s = new Stack(n);
	while(true) { 
		System.out.println("Press 1 for -------> PUSH");
		System.out.println("Press 2 for -------> POP");
		System.out.println("Press 3 for -------> DISPLAY");
		System.out.println("Any Other Number---> STOP ");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:s.push();
		       break;
		case 2:s.pop(); 
		       break;
		case 3:s.display();
		       break;
		default:System.exit(0);
		}
	}
}
}
