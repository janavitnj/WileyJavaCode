package Collections;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Venkat");
		tmap.put(2, "janavi");
		tmap.put(5, "rishav");
		tmap.put(3, "shiv");
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		tmap.forEach((k,v)->System.out.println(k+"  "+v));
		System.out.println(tmap.lastKey());
		
		System.out.println(tmap.headMap(3));
		System.out.println(tmap.tailMap(3).values());
		
		TreeMap<String,Integer> t=new TreeMap<>();
		t.put("a", 1);
		t.put("ba", 2);
		t.put("bc", 3);
		t.put("d", 4);
		System.out.println(t);
	}

}
