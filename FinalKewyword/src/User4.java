//you cannot asssign the variable
public class User4 {
	final int no;
	public void show() {
		no = 10;
		System.out.println("Final instance variable no = "+no);
	}
	public static void main(String[]args) {
		User4 user = new User4();
		user.show();
		
	}
}
