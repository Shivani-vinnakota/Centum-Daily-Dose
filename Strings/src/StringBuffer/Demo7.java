package StringBuffer;

public class Demo7
{
 public static void main(String[] args)
 {
	 StringBuffer sb = new StringBuffer("Hello");
     System.out.println(sb);
     
     sb.replace(1, 3, "Java");
     System.out.println(sb);
}
}
