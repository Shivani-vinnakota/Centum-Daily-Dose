package CollectionsHashSet;

import java.util.TreeSet;
import java.util.Comparator;
public class Demo4 
{
 public static void main(String[] args) {
	TreeSet<Integer>set = new TreeSet<Integer>(new MyComparator());
	set.add(10);
	set.add(1000);
	set.add(100);
	set.add(11);
	set.add(101);
	System.out.println(set);
	

 class MyComparator implements Comparator
   {
	 public int compare(object obj1,object obj2)
	 {
		 Integer i1 = (Integer)obj1;
		 Integer i2 = (Integer)obj1;
		 
		 if(i1<i2)
		 {
			 return +1;
		 }
		 else if(i1>i2)
		 {
			 return -1;
			 
		 }
		 else
		 {
			 return 0;
		 }
		 
	 }
  }
 }
}
