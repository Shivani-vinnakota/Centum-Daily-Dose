
abstract class Parent2 {
	public void show() {
		 System.out.println("Parent Class Show");
	 }
	public abstract void display();
}
class User2 extends Parent2{
	public void display()
	{
		System.out.println("Parent Class Display Implementation");
	}
	public static void main(String[] args) {
		User2 u = new User2();
		u.show();
		u.display();
	}
}
