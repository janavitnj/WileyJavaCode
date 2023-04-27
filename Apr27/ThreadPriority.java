package Apr27;
class TPrio extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(9);
		for(int i=1;i<=10;i++)
			System.out.println("ThreadName:-"+Thread.currentThread().getName()
					+" Threadpriority:"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*TPrio t1=new TPrio();
		TPrio t2=new TPrio();
		t2.setPriority(9);*/
		
		TPrio t1=new TPrio();
		TPrio t2=new TPrio();
		TPrio t3=new TPrio();
		t1.setName("first");
		t1.setName("second");
		t1.setName("third");
		t1.start();
		t1.join();
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
	}

}
