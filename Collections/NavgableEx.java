package Collections;

import java.util.TreeSet;
import java.util.NavigableSet;
public class NavgableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NavigableSet<String> tsl=new TreeSet<>();
		tsl.add("ava");
		tsl.add("java");
		tsl.add("java");
		tsl.add("python");
		tsl.add("a");
		System.out.println(tsl);
		System.out.println(tsl.pollFirst());
		System.out.println(tsl);
	}

}
