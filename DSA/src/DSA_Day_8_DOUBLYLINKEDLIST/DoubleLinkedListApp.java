package DSA_Day_8_DOUBLYLINKEDLIST;
import java.util.Scanner;

public class DoubleLinkedListApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		while(true) {
			System.out.println("Press 1 ------->InsertRear");
			  System.out.println("Press 2 ------->DeleteRear");
			  System.out.println("Press 3 ------->InsertFront");
			  System.out.println("Press 4 ------->DeleteFront");
			  System.out.println("Press 5 ------->DisaplayForward");
			  System.out.println("Press 6 ------->DisaplayReverse");
			  System.out.println("Press Any other Number---->STOP");
	      System.out.println("Enter your choice");
	      int choice=scan.nextInt();
	      switch(choice) {
		      case 1 : dll.insertRear();
		               break;
		      case 2 : dll.deleteRear();
		               break;
		      case 3 : dll.insertFront();
		               break;
		      case 4 : dll.deleteFront();
		               break;
		      case 5 : dll.displayForward();
		               break;
		      case 6 : dll.displayReverse();
                       break;
		      default:System.exit(0 );
		}
	  }
	}
}
