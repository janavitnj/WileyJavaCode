package Apr24;

interface Bank {
	void account();

}

interface Bank1 {
	void account();
}

interface ATM extends Bank, Bank1 {
	void insertCard();

	void selectOption();

	void enterPassword();

}

interface AA {
	void m1();
}

abstract class NewATM implements ATM, AA {
	public void m1() {
	}

	public void account() {

	}
}

public class InterfaceBank extends NewATM {

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert card");
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("Select");
	}

	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("enter password");
	}

}
