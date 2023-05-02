package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc=new Vector<>();
		vc.add("a");
		vc.add("b");
		vc.add("C");
		
		Enumeration<String> ev=vc.elements();
		while(ev.hasMoreElements())
		{
			System.out.println(ev.nextElement());
		}
		
		System.out.println("This is iterator");
		Iterator<String>i=vc.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		LinkedList<String> a=new LinkedList<>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		
		ListIterator<String> listr=a.listIterator();
		System.out.println("Previous");
		while(listr.hasPrevious())
		{
			System.out.println(listr.previous());
		}
		while(listr.hasNext())
		{
			System.out.println(listr.next());
		}
		
		
	}

}
