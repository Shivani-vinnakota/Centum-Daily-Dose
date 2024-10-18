
public class Test 
{
 private Test()
 {}
 static Test getTest()
 {
	 return new Test();
 }
 void show()
 {
	 System.out.println("Show Method");
 }
 String display()
 {
	 return "Hello";
 }
}
