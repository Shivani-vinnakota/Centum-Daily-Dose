package CollectionsDay2_1;
import java.util.ArrayList;
import java.util.Iterator;

public class Student 
{
 Integer rollNo;
 String name;
 Float marks;
 
 public Student(Integer rollNo,String name,Float marks)
 {
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
 }
 public String toString()
 {
	 return rollNo +" "+name+" "+marks;
 }
}
class Demo1{
	public static void main(String[]args)
	{
		Student student1 = new Student(101,"Shivani",78.6f);
		Student student2 = new Student(102,"Shiv",88.6f);
		Student student3 = new Student(103,"Sneha",98.6f);
		
		ArrayList<Student>list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		System.out.println(list);
		
	}
}
