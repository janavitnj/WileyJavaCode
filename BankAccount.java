package Apr24;

public class BankAccount {
	private int accnum;
	private double balance;
	private String name;

	public int getAccnum() {
		return accnum;
	}

	

	public double getBalance() {
		return balance;
	}

	

	public String getName() {
		return name;
	}

	public void deposit(double amount)
	{
		balance+=amount;
	
	}
	
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
		balance-=amount;
		}
		else
		{
			System.out.println("insufficient balance");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
