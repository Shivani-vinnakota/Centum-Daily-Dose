package StringMethods;

public class Demo1 {
	public static void main(String a[]) {
		String str = "Java Session Java Class";
		String msg = "Hello Mam";
		Integer no = 35;
		String sno = String.valueOf(no);
		System.out.println(str.charAt(2));//v
		
		System.out.println(str.indexOf('a'));//1
		System.out.println(str.indexOf('a',3));//3
		System.out.println(str.indexOf("Java"));//0
		System.out.println(str.indexOf("Java",5));//13(bcz it will calculate space also)
		
		System.out.println(msg.length());
		System.out.println(msg.replace('H' , 'h'));//hello Mam
		System.out.println(msg.replace("Hello", "Bye"));
		
		System.out.println(msg.toLowerCase());
		System.out.println(msg.toUpperCase());
		
		System.out.println(no);
		System.out.println(no.getClass());
		System.out.println(no.getClass().getName());
		
		System.out.println(no);
		System.out.println(sno.getClass());
		
	}

}
