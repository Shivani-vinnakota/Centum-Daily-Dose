package CollectionsHashSet;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class Demo5
{
 public static void main(String[] args)
 {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(101,"Neha");
	map.put(103, "pooja");
	map.put(102, "Amit");
	System.out.println(map);
	
	for(Map.Entry e:map.entrySet())
	{
		//System.out.println(e);
		System.out.println(e.getKey()+" "+ e.getValue());
	}
 }
}
