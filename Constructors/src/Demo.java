
public class Demo {
Demo(String msg){
	this('s');
	System.out.println("A");
}
Demo(){
	System.out.println("B");
}
Demo(int msg){
	this();
	System.out.println("C");
}
public static void main(String[]args) {
	Demo s1= new Demo("java");
}
}
