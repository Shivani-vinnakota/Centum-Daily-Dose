
final class Parent {
	public void showParent() {
		System.out.println("Parent class method");
   }
	class Child extends Parent{
		public void showChild() {
		System.out.println("Child class methof");
	}
	}
	class User{
		public static void main(String[]args) {
			Child c = new Child();
			c.showParent();
			c.showChild();
		}
	}

}
