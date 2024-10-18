package uncheckedException;

public class Demo 
{
	public  static void show()
	{
		try
		{
			throw  new ClassNotFoundException();
			throw new NullPointerException();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String a[])
	{
		show();
	}

}
