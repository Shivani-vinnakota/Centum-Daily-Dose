package DSA_Day_5_CIRCULARQUEUE;

import java.util.Scanner;

import DSA_Day_4_QUEUE.Queue;

public class CircularQueueApp {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the size of CIRCULARQUEUE");
		  int n = scan.nextInt();
		  CircularQueue cq = new CircularQueue(n);
		  while(true)
		  {
			  System.out.println("Press 1 ------->insert");
			  System.out.println("Press 2 ------->delete");
			  System.out.println("Press 3 ------->display");
			  System.out.println("Pressany number---------->To STOP");
	        System.out.println("Enter your choice");
	        int choice=scan.nextInt();
	        switch(choice) {
	        case 1 : cq.insert();
	                break;
	        case 2 : cq.delete();
	                 break;
	        case 3 : cq.display();
	                 break;
	        default:System.exit(0 );
	        }
	        
		  }
	}
}
