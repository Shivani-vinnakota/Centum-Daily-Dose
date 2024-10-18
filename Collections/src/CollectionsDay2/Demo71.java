package CollectionsDay2;

import java.util.ArrayList;

public class Demo71 
{
	public static void main(String[]args) 
	   {
		   ArrayList<String> list1 = new ArrayList<String>();
		   list1.add("Black");
		   list1.add("White");
		   list1.add("Red");
		   System.out.println(list1.size());
		   
		   if(list1.contains("Red"))
		   {
			   System.out.println("Found");
		   }
		   else
		   {
			   System.out.println("Not Found");
		   }
}
}