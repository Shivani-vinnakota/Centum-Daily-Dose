package StringBuffer;
//default capacity
public class Demo {
public static void main(String[] args) 
{
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Hello");
	System.out.println(sb.capacity());
}
}
