
public class Demo1 {
	
private int rollNo;
private String name;

Demo1(int rollNo,String name){
	this.rollNo = rollNo;
	this.name = name;	
}
void displayInfo() {
	System.out.println("RollNo ="+rollNo);
	System.out.println("Name ="+name);
	}
}
class User1{
	public static void main(String a[]) {
	Demo1 s1 = new Demo1(101,"Ammulu");
	Demo1 s2 = new Demo1(102,"chitti");
	s1.displayInfo();
	s2.displayInfo();
				
	}
}

