package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class FailSafe {
	public static void main(String[] args)
	{
		Map<Integer,String> mymap=new ConcurrentHashMap<>();
		mymap.put(1, "java");
		Iterator<Integer> iter=mymap.keySet().iterator();
		while(iter.hasNext())
		{
			int i=(Integer)iter.next();
			System.out.println(i);
			mymap.put(3, "python");
		}
		System.out.println("hii");
	}
}
