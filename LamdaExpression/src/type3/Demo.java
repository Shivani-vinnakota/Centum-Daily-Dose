package type3;

public class Demo 
{
public static void main(String[] args)
{
	MyInterface my1 = (int x,int y)->{System.out.println("sum = "+(x+y));};
	my1.sum(10,20);
	
	MyInterface my2 = (int x,int y)->{System.out.println("sum = "+(x+y));};
	my2.sum(20,30);
	
	//MyInterface my = x,y->{System.out.println("sum = "+(x+y));};
	
}
}
