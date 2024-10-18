
public class User5 {
	final int no;
	User5(){
		no = 20;
	}
	public void show() {
	
		System.out.println("Final instance variable no = "+no);
	}
	public static void main(String[]args) {
		User5 user = new User5();
		user.show();
		
	}
}
