
public class Demo3 {
void addNumber(int no[]) {
	int sum = 0;
	for(int value : no) {
		sum = sum+value;
	}
	System.out.println("Sum of all numbers "+sum);
}
public static void main(String[]args) {
	int arr[] = {1,2,3,4,5,6,7};
	Demo3 demo = new Demo3();
	demo.addNumber(arr);
	
}
}
