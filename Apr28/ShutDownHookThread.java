package Apr28;
class CloseEvent extends Thread
{
	public void run()
	{
		System.out.println("Hook Current Thread:"+Thread.currentThread());
	}
}

class CloseEvent1 extends Thread
{
	public void run()
	{
		System.out.println("Current Thread:"+Thread.currentThread());
	}
}
public class ShutDownHookThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		
		r.addShutdownHook(new CloseEvent());
		
		for(int i=1;i<=10;i++)
		{
			CloseEvent1 t1=new CloseEvent1();
			t1.start();
		}

	}

}
