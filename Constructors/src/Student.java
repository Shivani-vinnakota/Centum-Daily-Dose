
public class Student {
	Student(String msg){
		System.out.println("Parameterised Constructor " +msg);
	}
public static void main(String[]args) {
	//Student s1 = new Student();CTE
	Student s1 = new Student("Hello Mam....");
	Student s2 = new Student("Hello Students");
}
}
