package StringMethods;

public class Demo5 {
public static void main(String[] args) {
	String str1[]= {"This","is","Java","Session"};
	String str2 = String.join("@", str1);
	System.out.println(str2);
	
	String date = String.join("/", "03","08","2023");
	System.out.println(date);
}
}
