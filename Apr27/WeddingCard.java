package Apr27;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WeddingCards extends Thread
{
	public void run()
	{
		System.out.println("Thread name:"+Thread.currentThread().getName());
	}
}
public class WeddingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExecutorService executor=Executors.newFixedThreadPool(4);
		ExecutorService executor=Executors.newCachedThreadPool();
		
		for(int i=0;i<=100;i++)
		{
			executor.execute(new WeddingCards());
		}
		
	}

}
