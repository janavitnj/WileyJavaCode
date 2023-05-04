package Collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		Iterator<String> iter=list.iterator()
;
		
		
		while(iter.hasNext())
		{
			list.add("C");
			String el=iter.next();
			System.out.println(el);
		
		}
		System.out.println(list);
}

}
