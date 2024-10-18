package StringBuffer;

public class Student
{
  private int rollNo;
  private String name;
  private float marks;
  public Student(int rollNo,String name,float marks)
  {
	  this.rollNo = rollNo;
	  this.name = name;
	  this.marks = marks;
  }
  public String getValues()
  {
	  return rollNo+" "+name+" "+marks;
  }
}
