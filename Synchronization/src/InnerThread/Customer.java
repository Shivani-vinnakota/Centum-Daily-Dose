package InnerThread;

public class Customer 
{
 synchronized void withdraw(int amount)
 {
	 System.out.println("Withdraw start....");
	 if(amount >=3000)
	 {
		 System.out.println("Insufficient amount....Wait for deposit..");
		 try
		 {
			 wait();
		 }
		 catch(Exception e)
		 { }
	 }
	 System.out.println("Withdraw Completed of amount..." +amount);
 }
 synchronized void deposit(int amount)
 {
	 System.out.println("Deposit Start....");
	 System.out.println("Deposit Completed of amount...." +amount);
	 notify();
 }
}
