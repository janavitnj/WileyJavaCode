package Collections;

import java.util.TreeSet;

public class SetClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("h");
		ts.add("e");
		ts.add("wcdef");
		ts.add("bcd");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		//System.out.println(ts.headSet("w"));
		//System.out.println(ts.tailSet("a"));
		//System.out.println(ts.subSet("a","w"));
		
		String obj1=ts.first();
		String obj2=ts.last();
		System.out.println(obj2);
		System.out.println(obj1.compareTo(obj2));
		
	}

}
