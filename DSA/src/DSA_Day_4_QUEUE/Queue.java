package DSA_Day_4_QUEUE;

import java.util.Scanner;

public class Queue {
	private int  q[];
	private int  r =-1;
	private int  f=0;
	private int size;
	private Scanner scan = new Scanner(System.in);
	public Queue(int n) {
		q = new int[n];
		size=q.length;
	}
	public void insert() {
		if(r==size-1) {
			System.out.println("Insertion not possible");
		}
		else
		{
			System.out.println("Enter the element");
			int elem = scan.nextInt();
			++r;
			q[r]=elem;
		}
	}
	
	public void delete() {
		if(r==-1 || f>r) {
			System.out.println("Deletion not possible");
		}
		else
		{
			System.out.println("deleted element is :"+q[f]);
			++f;
		}
	}
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Display not possible");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
}
