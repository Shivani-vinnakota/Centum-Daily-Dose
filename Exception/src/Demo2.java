
public class Demo2 {
static void show() {
	  try {
			System.out.println("Show Start");
			int div = 10/0;
			System.out.println("Result = "+div);
			String Str ="";
			System.out.println(Str.charAt(1));
				
		}
	catch(ArithmeticException e){
			System.out.println(e);		
		}
	catch(StringIndexOutOfBoundsException e){
		System.out.println(e);		
	 }
	       
	  System.out.println("Show End");
	}
  public static void main(String []args) {
		show();
				
	}
}
