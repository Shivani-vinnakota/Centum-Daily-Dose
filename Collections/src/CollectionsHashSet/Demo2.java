package CollectionsHashSet;

import java.util.TreeSet;
public class Demo2 
{
  public static void main(String[] args) {
	TreeSet<Integer>set = new TreeSet<Integer>();
	set.add(10);
	set.add(10000);
	//set.add(null);//NullPointerException
	set.add(1000);
	set.add(10);
	System.out.println(set);
}
}
