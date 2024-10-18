
public class ComparsionOfString {
public static void main(String[]a) {
	String str1 = "Centum";
	String str2 = "Centum";
	String str3 = new String("Centum");
	String str4 = new String("centum");
	//By using Equal method(checks the literals)
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	System.out.println(str1.equals(str4));
	System.out.println(str3.equals(str4));
	//By using == operator(check the referenece)
	System.out.println(str1==str3);
	System.out.println(str1==str2);
	System.out.println(str1==str4);
	System.out.println(str2==str3);
	
	
	
	
	
}
}
