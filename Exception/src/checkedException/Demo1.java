package checkedException;
import java.util.Scanner;
public class Demo1 
{
  public static void checkAge(Integer age)throws InvalidAgeException
  {
	  
		if(age<=40 && age>=18)
		{
			System.out.println("Valid Age");
		}
		else
		{
			throw new InvalidAgeException();
		}
  }
  public static void main(String a[])
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter Age");
	  Integer age = scan.nextInt();
	  try {
		  checkAge(age);
	  }
	  catch(InvalidAgeException e)
	  {
		  System.out.println(e);
	  }
	  }
}
