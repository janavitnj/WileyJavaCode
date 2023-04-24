package Apr24;

public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method1();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void method1() throws Exception
	{
		method2();
	}
	
	public static void method2() throws Exception
	{
		throw new Exception("Exception in method 2");
	}

}
