package DSA_Day_2_ARRAY;

import java.util.Scanner;

public class ArrayApp
{
public static void main(String[] args) 
{ 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array length");
	int n = scan.nextInt();
	Array a = new Array(n);
	while(true) {
		System.out.println("Press1---------->Inserting");
		System.out.println("Press2---------->Deleting");
		System.out.println("Press3---------->Display");
		System.out.println("Any other number for exiting");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch(choice) 
		{
		case 1: a.insert();
		        break;
		case 2:a.delete();
		        break;
		case 3:a.display();
		        break;
		case 4:System.exit(0);
		}
	}
}
}
