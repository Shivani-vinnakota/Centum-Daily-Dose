package CollectionsDay2;
//we are using iterator to traverse
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Red");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
}
}