package type1;

public class Demo {
public static void main(String[] args) 
{
	MyInterface my =()->{System.out.println("show method overriden");};
	my.show();
	MyInterface my1 = ()->{ System.out.println("show1");
	               System.out.println("show 2");};
	               my1.show();
	}
}
 
