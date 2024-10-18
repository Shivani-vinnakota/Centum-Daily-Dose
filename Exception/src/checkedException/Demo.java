package checkedException;

public class Demo 
{
public static void main(String[] args) 
{
	int age = 15;
	if(age<=40 && age>=18)
	{
		System.out.println("Valid Age");
	}
	else
	{
		try {
			throw new InvalidAgeException();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
}
