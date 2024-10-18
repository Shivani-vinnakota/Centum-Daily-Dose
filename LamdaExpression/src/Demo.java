
public class Demo {
public static void main(String[] args) {
	MyInterface my = new MyInterface()
	{
			public void show()
		{
			System.out.println("Show Method Overridding");
		}
	};
	my.show();
}
}
