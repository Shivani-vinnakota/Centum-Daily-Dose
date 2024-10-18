
public class Demo3
{
 public static void show()
 {
	 try
	 {
		 int div = 10/0;
		 String str=" ";
		 int arr[]= {10,2,3};
		 System.out.println(arr[1]);
		 System.out.println(str.charAt(1));
		 System.out.println(div);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println(e);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println(e);
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 
	 System.out.println("Show End");
 }
 public static void main(String a[])
 {
	 show();
	 System.out.println();
 }
}
