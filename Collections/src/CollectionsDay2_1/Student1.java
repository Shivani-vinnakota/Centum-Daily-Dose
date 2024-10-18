package CollectionsDay2_1;

import java.util.ArrayList;
import java.util.Iterator;
public class Student1 {
	Integer rollNo;
	 String name;
	 Float marks;
	 
	 public Student1(Integer rollNo,String name,Float marks)
	 {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	 }
	 public String toString()
	 {
		 return rollNo +" "+name+" "+marks;
	 }
	 class Demo2{
		public static void main(String[]args)
		{
				Student1 student1 = new Student1(101,"Shivani",78.6f);
				Student1 student2 = new Student1(102,"Shiv",88.6f);
				Student1 student3 = new Student1(103,"Sneha",98.6f);
				
				ArrayList<Student1>list = new ArrayList<Student1>();
				list.add(student1);
				list.add(student2);
				list.add(student3);
				
				System.out.println(list);
				Iterator itr = list.iterator();
				System.out.println("RollNo  Name  Marks");
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				
	   }
   }
}
