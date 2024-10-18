
public class User6 {
final int panNo;
User6(int panNO){
	this.panNo = panNo;	
}
public void show() {
	System.out.println("panNo = "+panNo);
}
public static void main(String[]args) {
	User6 user = new User6(200004567);
	User6 user2 = new User6(324504567);
	user.show();
	user2.show();
}
}
