package StringBuffer;

public class StudentDemo 
{
 public static void main(String[] args) {
	Student s1 = new Student(101,"Amith",89);
	Student s2 = new Student(102,"Sumith",99);
	
	System.out.println(s1.getValues());
	System.out.println(s2.getValues());
	System.out.println(s1);
	System.out.println(s2.toString());
}
}
