package CollectionsHashSet;
import java.util.HashSet;
public class Demo 
{
  public static void main(String[] args)
  {
	HashSet<Integer>set = new HashSet<Integer>();
	set.add(10);
	set.add(10000);
	set.add(null);
	set.add(1000);
	set.add(10);
	set.add(null);
	System.out.println(set);
	
}
}
