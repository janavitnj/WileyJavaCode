package Apr28;
class SupportClass extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("This is demon");
		}
		else
		{
			System.out.println("Not a demon Thread");
		}
	}
}
public class DemonType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupportClass t1=new SupportClass();
		SupportClass t2=new SupportClass();
		t2.setDaemon(true);
	
		t1.start();
		t2.start();
	}

}
