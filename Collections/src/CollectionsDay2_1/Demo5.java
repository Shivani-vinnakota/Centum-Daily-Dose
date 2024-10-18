package CollectionsDay2_1;
import java.util.LinkedList;
public class Demo5 
{
  public static void main(String[] args)
  {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(100);
	list.add(1000);
	System.out.println(list);
	list.add(20);
	list.add(40);
	System.out.println(list);
	
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	
 }
}
