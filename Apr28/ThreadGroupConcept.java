package Apr28;

class Demo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}
	
}
public class ThreadGroupConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tgParent=new ThreadGroup("Parent Group");
		ThreadGroup tgChild=new ThreadGroup(tgParent,"Child");
		
		Thread t1=new Thread(tgParent,new Demo(),"first");
		Thread t2=new Thread(tgParent,new Demo(),"second");
		Thread t3=new Thread(tgChild,new Demo(),"third");
		Thread t4=new Thread(tgParent,new Demo(),"fourth");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("active threads:"+tgParent.activeCount());
		System.out.println("active threads:"+tgChild.activeCount());
		tgParent.list();
	}

}
