package Apr24;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("111");
			System.out.println("wiley");
			try
			{
			System.out.println(10 / 0);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.print("Nexted close connection");
			}
			//System.out.println(10/0);
			// System.exit(0); when executed program is terminated
			System.out.println("edge");
		} catch (Exception e) {
			System.out.println("12");
			try
			{
			System.out.println(10 / 0);
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		} finally {
			//System.out.println(10 / 0);
			System.out.println("final block");
			try
			{
			System.out.println(10 / 0);
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("hii");
	}

}
