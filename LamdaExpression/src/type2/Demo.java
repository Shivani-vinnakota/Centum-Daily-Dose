package type2;

public class Demo 
{
	public static void main(String[] args) {
		
	MyInterface my1 =(String name)->{System.out.println("hello"+name);};
	my1.show("priya");
	
	MyInterface my2 =(String str)->{System.out.println("hello"+str);};
	my2.show("priya");
	
	MyInterface my3 =(str)->{System.out.println("hello"+str);};
	my3.show("priya");
	
	MyInterface my4 = str->{System.out.println("hello"+str);};
	my4.show("priya");
	
	}		
}
