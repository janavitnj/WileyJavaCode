package Apr24;
class AgeNotValid extends Exception
{
	
	public AgeNotValid(String mes)
	{
		super(mes);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "invalid age";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class AgeNotValid";
	}
}
public class CustomException {
	
	public static void getAge(int age) throws AgeNotValid
	{
		if(age>18)
		{
			try {
			throw new AgeNotValid("age not valid");
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else
		{
			System.out.println("Age valid");
		}
	}

	public static void main(String[] args)throws AgeNotValid {
		// TODO Auto-generated method stub
		getAge(20);
	}

}
