package Collections;

import java.util.*;

public class MapClasses {

	public static void main(String[] args)
	{
		HashMap<String,String> ss=new HashMap<>();
		ss.put("a", "A");
		ss.put("c", null);
		ss.put("b", "B");
		ss.put(null, "c");
		ss.put("d", null);
		ss.put(null, null);
		
		System.out.println(ss);
		
		HashMap<String,Integer> empID=new HashMap<>();
		empID.put("venkat", 1);
		empID.put("Janavi", 2);
		System.out.println(empID);
		
		Map myMap=new LinkedHashMap();
		myMap.put(1, 2);
		myMap.put("a", "A");
		System.out.println(myMap);
	}
}
