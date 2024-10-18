package DSA_Day_7_SINGLYLINKEDLIST;
import java.util.Scanner;
public class LinkedList
{
	class Node{
		int data;
		Node link;
	}
	private Node first;
	private Scanner scan  = new Scanner(System.in);
	 public void insertRear() {
		 Node temp;
		 System.out.println("Enter an element");
		 int elem = scan.nextInt();
		 Node newnode = new Node();
		 newnode.data=elem;
		 newnode.link=null;		 
		 if(first==null) {
			 first = newnode;
		 }
		 else {
			 temp = first;
			 if(temp.link!=null) {
				 temp = temp.link;
			 }
			 temp.link = newnode;
		 }
	 }
	 
	 public void deleteRear() {
		 Node temp;
		 if(first==null) {
			 System.out.println("Deletion Not Possible");
		 }
		 if(first.link==null) {
			 System.out.println("Element Deleted is:"+first.data);
			 first=null;
		 }
		 else {
			 temp = first;
			 if(temp.link.link!=null) {
				 temp = temp.link;
			 }
			 System.out.println("Element Deleted is :"+temp.link.data);
			 temp.link=null;
		 }
	 }
	 
	 public void insertFront() {
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.link=null;
		if(first==null) {
			first = newnode;
		}
		else {
			newnode.link=first;
			first = newnode;
		}
	 }
	 
	 public void deleteFront() {
		 if(first == null) {
			 System.out.println("Deletion Not Possible");
		 }
		 if(first.link==null) {
			 System.out.println("Element delted is :"+first.data);
			 first = null;
		 }
		 else {
			 System.out.println("Element deleted is :"+first.data);
			 first = first.link;
		 }
	 }
	 
	 public void display() {
		 Node temp;
		 if(first == null) {
			 System.out.println("Display Not Possible");
		 }
		 else if(first.link == null) {
			 System.out.println(first.data);
		 }
		 else {
			 temp = first;
			 while(temp!=null) {
				 System.out.println(temp.data);
				 temp = temp.link;
			 }
			 System.out.println();
		 }
	 }
}
