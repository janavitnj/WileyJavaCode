package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hsl=new HashSet<>();
		hsl.add("Java");
		hsl.add("java");
		hsl.add("java");
		hsl.add("python");
		hsl.add("a");
		
		System.out.println(hsl);
		TreeSet<String> tsl=new TreeSet<>();
		tsl.add("ava");
		tsl.add("java");
		tsl.add("java");
		tsl.add("python");
		tsl.add("a");
		
		System.out.println(tsl);
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("aa");
		a.add("bb");
		a.add("aa");
		a.add("cc");
		hsl.addAll(a);
		System.out.println(hsl);
		
		LinkedHashSet l=new LinkedHashSet();
		l.add(1);
		l.add(6);
		l.add(2);
		l.add(null);
		System.out.println(l);
		
	}

}
