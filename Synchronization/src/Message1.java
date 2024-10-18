
public class Message1 
{
   void printMsg(String Msg) {
	   synchronized(this)
	   {
		   for(int i=0;i<=3;i++)
		   {
			   System.out.println(Thread.currentThread().getName());
		   }
	   }
	   for(int i=0;i<=3;i++)
	   {
		   System.out.println(msg);
	   }
   }
}
