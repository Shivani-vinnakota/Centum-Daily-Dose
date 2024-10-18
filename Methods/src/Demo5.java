
public class Demo5 {
void add(int...no) {
	for(int value : no) {
		System.out.println(value);
	}
}
public static void main(String[]args) {
	int arr[] = {1,2,3,4};
	Demo5 d = new Demo5();
	d.add(arr);
}
}
