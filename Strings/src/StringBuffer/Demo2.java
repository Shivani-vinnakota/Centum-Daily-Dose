package StringBuffer;
//you can increase string buffer capacity
public class Demo2
{
 public static void main(String[] args) 
{
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);
	System.out.println(sb.capacity());
}
}
