package Apr28;

class BankAccount
{
	int amount=1000;
	public synchronized void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("Amount is less");
			try
			{
				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("withdraw done");
		}
	}
	public synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Amount deposited");
		notify();
	}
}
public class InterCommunication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		Thread t1=new Thread()
				{
				public void run()
				{
					b.withdraw(1500);
				}
				};
				Thread t2=new Thread()
				{
				public void run()
				{
					b.deposit(1000);
				}
				};
				t1.start();
				t2.start();
	}

}
