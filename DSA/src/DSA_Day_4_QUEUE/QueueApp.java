package DSA_Day_4_QUEUE;

import java.util.Scanner;

public class QueueApp
{
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the size of QUEUE");
	  int n = scan.nextInt();
	  Queue q = new Queue(n);
	  while(true)
	  {
		  System.out.println("Press 1 ------->insert");
		  System.out.println("Press 2 ------->delete");
		  System.out.println("Press 3 ------->display");
		  
        System.out.println("Enter your choice");
        int choice=scan.nextInt();
        switch(choice) {
        case 1 : q.insert();
                break;
        case 2 : q.delete();
                 break;
        case 3 : q.display();
                 break;
        default:System.exit(0 );
        }
        
	  }
}

}
