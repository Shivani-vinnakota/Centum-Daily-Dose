package CollectionsDay2;
import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Black");
		list.add("Red");
		for(String str : list) {
			System.out.println(str);
		}
}
}
