package Apr24;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First statement");
		int a[]= {1,2,3};
		try
		{
			System.out.println(a[1]);
			System.out.println(a[2]);
			
			System.out.println("simple ");
			String str="Janavi";
			System.out.println(str.charAt(3));
			System.out.println(12/0);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("catch 2");
			e.printStackTrace();
		}catch(Exception e)
		{
			System.out.println("catch 3");
			e.printStackTrace();
		}
		
		System.out.println("Another statement");
		
	}

}
