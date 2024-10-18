package CollectionsDay2;
import java.util.ArrayList;
public class Demo4 {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Black");
		list.add("Red");
		System.out.println(list);
		System.out.println(list.size());
		list.add(2,"Blue");
		System.out.println(list);
		System.out.println(list.size( ));
	}

}
