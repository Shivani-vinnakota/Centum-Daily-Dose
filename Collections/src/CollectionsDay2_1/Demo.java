package CollectionsDay2_1;
import java.util.ArrayList;
public class Demo 
{
  public static void main(String[] args)
  {
	ArrayList<String>list1 = new ArrayList<String>();
	list1.add("Black");
	list1.add("White");
	list1.add("Red");
	list1.add("Red");
	list1.add("Green");
	
	System.out.println(list1.get(2));
	System.out.println(list1.indexOf("Red"));
	System.out.println(list1.lastIndexOf("Red"));
	
	list1.remove(2);
	System.out.println(list1);
	list1.remove("Green");
	System.out.println(list1);
	System.out.println(list1.isEmpty());
	
}
}
