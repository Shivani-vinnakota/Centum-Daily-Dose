import java.util.List;
import java.util.ArrayList;

public class NonGeneric {
   public static void main(String[]args) {
	   List list = new ArrayList();
	   list.add(10);
	   list.add(100.56);
	   list.add("Shivani");
	   list.add(10);
	   list.add(100.56);
	  System.out.println(list);
   }
}
