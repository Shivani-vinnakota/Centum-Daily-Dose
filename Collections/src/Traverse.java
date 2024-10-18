import java.util.ArrayList;
import java.util.Iterator;
public class Traverse {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(null);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
		}

}
