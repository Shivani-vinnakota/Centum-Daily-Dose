//different type of parameters
public class Demo1 {
	public void display(int no) {
		System.out.println("int no = "+ (no));
	}
	public void display(char no) {
		System.out.println("char no = "+ (no));
	}
	public void display(String no) {
		System.out.println("String no = "+ (no));
	}
}
class Users{
	public static void main(String[]args) {
		Demo1 d = new Demo1();
		d.display(10);
		d.display('A');
		d.display("java");
		
	}
}