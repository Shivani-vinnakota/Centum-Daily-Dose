//you can assign the variable at the time of declaration
public class User3 {
final int no=20;
public void show() {
	no = 10;//you cannot assign in b/w
	System.out.println("Final instance variable no = "+no);
}
public static void main(String[]args) {
	User3 user = new User3();
	user.show();
	
}
}
