package Apr28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {
	private ExecutorService threadPool;
	private ThreadGroup databaseThreadgroup;
	private ThreadGroup reportThreadGroup;
	
	public RequestProcessor()
	{
		threadPool=Executors.newFixedThreadPool(10,new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		
		databaseThreadgroup=new ThreadGroup("Database Threads");
		reportThreadGroup=new ThreadGroup("Report Threads");
		
	}
	
	public void processRequest(Request request)
	{
		
	}
}

enum RequestType
{
	DATABASE_QUERY,
	REPORT_GENERATION;
}
class Request
{
	private RequestType type;
	private String setType;
	
	
}
