package Apr28;

class Sheet
{
	public synchronized void writeln(int k)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*k);
		}
	}
	
	class Person1 extends Thread
	{
		Sheet st;
		public Person1(Sheet st)
		{
			public void run()
			{
				st.writeln(MAX_PRIORITY);
			}
		}
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
