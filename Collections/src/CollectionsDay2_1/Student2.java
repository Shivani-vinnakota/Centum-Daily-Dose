package CollectionsDay2_1;

import java.util.ArrayList;
import java.util.Iterator;
public class Student2 {
	Integer rollNo;
	 String name;
	 Float marks;
	 
	 public Student2(Integer rollNo,String name,Float marks)
	 {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	 }
	 public String toString()
	 {
		 return rollNo +" "+name+" "+marks;
	 }
	 class Demo3{
		public static void main(String[]args)
		{
				Student2 student1 = new Student2(101,"Shivani",78.6f);
				Student2 student2 = new Student2(102,"Shiv",88.6f);
				Student2 student3 = new Student2(103,"Sneha",98.6f);
				
				ArrayList<Student2>list = new ArrayList<Student2>();
				list.add(student1);
				list.add(student2);
				list.add(student3);
				
				Iterator itr = list.iterator();
				System.out.println("RollNo\t Name\t Marks");
				while(itr.hasNext())
				{
					Student s = (Student)itr.next();
					System.out.println(s.rollNo +"\t"+s.name+"\t"+s.marks);
				}
					
				
       }
   }
}
