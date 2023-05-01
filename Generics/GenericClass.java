package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer<Integer> printer=new Printer(24);
		printer.print();
		
		Printer<Mobile> prints=new Printer(new Mobile());
		prints.print();
		
		shout("helllo",2000);
		
		List<Mobile> l=new ArrayList<>();
		l.add(new Mobile());
		
	}
private static void print(List<?> l)
{
	System.out.println(l);
}
private static <T,V> V shout(T shoutout,V val)
{
	System.out.println(shoutout+"...!!");
	System.out.println(val);
	return val;
}
}
