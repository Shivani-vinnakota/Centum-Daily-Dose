package CollectionsDay2;

import java.util.ArrayList;

public class Demo63 {
public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList<String>();
		ArrayList<String>list2 = new ArrayList<String>();
		ArrayList<String>list3 = null;
		
		list1.add("Black");
		list1.add("White");
		list1.add("Red");
		
		list2.add("Green");
		list2.add("White");
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(1,list3);//Null pointer exception
}
}