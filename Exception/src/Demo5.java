
public class Demo5 {
public static void show()
{
	try
	{
		int div = 10/2;
		System.out.println(div);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Show End");
	}
}
public static void main(String a[])
{
	show();
}
}

