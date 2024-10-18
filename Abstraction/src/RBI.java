abstract class RBI {
public abstract void interest() ;	
}
class SBI extends RBI{
	public void interest() {
		System.out.println("8% interest");
	}
}
class PNB extends RBI{
	public void interest() {
		System.out.println("8.5% interest");
	}
}
class User3{
	public static void main(String[] args) {
		RBI User3;
		User3 = new SBI();
		User3.interest();
		User3 = new PNB();
		User3.interest();
	}
}