package StringMethods;

public class Demo2 {
public static void main(String[] args) {
	String str1 = "Java Session Java Class";
	String str2 = "Hello";
	String str3 = str2.trim();
	
	System.out.println(str2.length());
	System.out.println(str2.trim().length());
	System.out.println(str3.length());
	
	System.out.println(str1.contains("Java Session"));
	System.out.println(str1.contains("java"));
	System.out.println(str1.contains("S"));
	
	System.out.println(str1.endsWith("s"));
	System.out.println(str1.endsWith("Class"));
	System.out.println(str1.startsWith("Java"));
}
}
