package StringMethods;

public class Demo4 {
	public static void main(String[] args) {
		String str1 = "";
		String str2[] = {"Hello","World"};
		String str3 = "Hello";
		
		System.out.println(str1.length());
		//System.out.println(str1.charAt(0));//StringIndexOutOfBoundsException
		System.out.println(str2[1]);//ArrayIndexOutOfBoundsException
		System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());
		
	
	}

}
