package CollectionsHashSet;

import java.util.LinkedHashSet;
public class Demo1 
{
  public static void main(String[] args) 
  {
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	set.add(10);
	set.add(10000);
	set.add(null);
	set.add(1000);
	set.add(10);
	set.add(null);
	System.out.println(set);
  }
}
