package StringBuffer;

public class Student1 {
	private int rollNo;
	  private String name;
	  private float marks;
	  public Student1(int rollNo,String name,float marks)
	  {
		  this.rollNo = rollNo;
		  this.name = name;
		  this.marks = marks;
	  }
	  public String toString()
	  {
		  return rollNo+" "+name+" "+marks;
	  }
}
