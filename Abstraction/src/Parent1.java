
public class Parent1 {
 public void show() {
	 System.out.println("Parent Class Show");
 }
}
class User1 extends Parent1
{
	public void show()
	{
		System.out.println("Parent Class Show");
	}
public static void main(String a[]) {
	Parent1 p = new Parent1 ();
	User1 u = new User1();
	u.show();
	
}
}