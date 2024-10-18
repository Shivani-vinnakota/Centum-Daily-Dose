package CollectionsDay2_1;

import java.util.ArrayList;

public class Student3 
{
	Integer rollNo;
	 String name;
	 Float marks;
	 
	 public Student3(Integer rollNo,String name,Float marks)
	 {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	 }
	 public String toString()
	 {
		 return rollNo +" "+name+" "+marks;
	 }
	 class Demo4{
			public static void main(String[]args)
			{
					Student3 student1 = new Student3(101,"Shivani",78.6f);
					Student3 student2 = new Student3(102,"Shiv",88.6f);
					Student3 student3 = new Student3(103,"Sneha",98.6f);
					
					ArrayList<Student3>list = new ArrayList<Student3>();
					list.add(student1);
					list.add(student2);
					list.add(student3);
					
	          System.out.println("RollNo\t Name\tName\tMarks");	
	          for(Student3 s :list)
	          {
	        	  System.out.println(s.rollNo+"\t"+s.name+"\t"+s.marks);
	          }
					
					
              }
	 }
}
