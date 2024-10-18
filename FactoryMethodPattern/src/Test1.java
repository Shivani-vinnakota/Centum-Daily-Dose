
public class Test1 
{
	static Test1 test;
	private Test1()
	{}
    static Test1 getTest()
    {
    	if(test==null)
    	{
    		test = new Test1();
    	}
    	return test;
    }
    void show()
    {
    	System.out.println("Show Method");
    }
}
