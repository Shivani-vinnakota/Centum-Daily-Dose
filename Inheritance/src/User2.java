
public class User2 {
	public static void main(String []args) {
		//hierarchical inheritance
		 
		 /*Child1 c1 = new Child1();
		  c1.parentShow();
		  c1.childShow();
		  Child1 c2 = new Child1();
		  c2.parentShow();
		  c2.childShow(); */
		
		  //Hybrid inheritance
		  Child1 c1 = new Child1();
		  c1.grandShow();
		  c1.parentShow();
		  c1.childShow();
		  Child1 c2 = new Child1();
		  c2.parentShow();
		  c2.parentShow();
		  c2.childShow();
		  
}
}
