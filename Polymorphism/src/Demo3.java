//different order of parameters are not applicable
public class Demo3 {
	public void add(int no1,float no2) {
		System.out.println("Add int float = "+ (no1+no2));
	}
	public void add(float no1,int no2) {
		System.out.println("Add float int= "+ (no1+no2));
	}
}
class display{
	public static void main(String[]args) {
		Demo3 d = new Demo3();
		d.add(10.4f,6);
		d.add(10,3.4F);
		
	}
}