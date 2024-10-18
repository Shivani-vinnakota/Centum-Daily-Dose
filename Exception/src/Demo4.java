
public class Demo4 
{
 public static void show()
 {
	 try
	 {
		 int div = 10/0;
		 System.out.println(div);
		 try {
			 String str = " ";
			 System.out.println(str.charAt(1));
			 try {
				 int arr[]= {10,2,3};
				 System.out.println(arr[1]);
			 }
			 catch(ArrayIndexOutOfBoundsException e) 
			 {
				 System.out.println(e);
			 }
		 }
		 catch(StringIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
	 }
	 catch(ArithmeticException e) {
		 System.out.println(e);
		 System.out.println(e.getMessage());
		 e.printStackTrace();
	 }
	 System.out.println("Show End");
 }
 public static void main(String[] args) {
	show();
	System.out.println();
}
}
