package Apr27;

class Parent
{
	public void m1()
	{
		System.out.println("This is method 1");
	}
}

class ThreadExtends extends Thread
{
	public void run()
	{
		System.out.println("By thread class");
	}
}

class ThreadImplements extends Parent implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In implemnts");
		
	}
	
}



public class ThreadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExtends t1=new ThreadExtends();
		t1.start();
		ThreadImplements t2=new ThreadImplements();
		Thread trd=new Thread(t2);
		t2.run();
		
	}

}
