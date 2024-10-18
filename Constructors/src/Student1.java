
public class Student1 {
private int rollNo; 
private String name;
private float marks;

Student1(int roll, String str,float no){
	rollNo = roll;
	name = str;
	marks = no;
}
void displayInfo() {
	System.out.println("RollNo ="+rollNo);
	System.out.println("Name ="+name);
	System.out.println("Marks ="+marks);
}
}
class User{
	public static void main(String[]args) {
		Student1 s1 = new Student1(101,"Aarthi",90.3f);
		Student1 s2 = new Student1(102,"Shivani",78);
		Student1 s3 = new Student1(103,"Punith",87);
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
	}
}
