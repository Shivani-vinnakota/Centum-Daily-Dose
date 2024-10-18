 
public class Message
{
  synchronized void printMsg(String msg)
  {   
	  for(int i=1;i<=5;i++)
	  {
		  try {
			  System.out.println(msg);
			  Thread.sleep(1000);
		  }
		  catch(Exception e) 
		  {
			  
		  }
	  }
  }
}

