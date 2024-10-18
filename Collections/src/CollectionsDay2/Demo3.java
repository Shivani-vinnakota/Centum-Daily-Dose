package CollectionsDay2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo3 {
		public static void main(String[] args) {
			LinkedList<String>list = new LinkedList<String>();
			list.add("Black");
			list.add("White");
			list.add("Red");
			list.add("Black");
			list.add("Red");
			ListIterator<String> itr = list.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
			
			
	}
}
