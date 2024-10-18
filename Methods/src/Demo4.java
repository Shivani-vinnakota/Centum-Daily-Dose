
public class Demo4 {
int addNumber(int no[]) {
	int sum = 0;
	for(int value : no) {
		sum = sum+value;
	}
	return sum;
}
public static void main(String[]args) {
	int arr[] = {1,2,3,4,5,6};
	Demo4 demo = new Demo4();
	System.out.println("Sum of all numbers = "+demo.addNumber(arr));
}
}
