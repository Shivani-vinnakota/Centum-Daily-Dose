
public class Parent2 {
	public final void showParent() {
		System.out.println("Parent class method");
   }
	class Child2 extends Parent2{
		public final void showParent() {
			System.out.println("Child class override parent method");
		}
		public void showChild() {
		System.out.println("Child class method");
	}
	}
	class User1{
		public static void main(String[]args) {
			Child2 child = new Child2();
			child.showParent();
			child.showChild();
		}
	}

}
