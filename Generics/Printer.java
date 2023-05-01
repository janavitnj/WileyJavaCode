package Generics;

public class Printer<T> {
	T valToPrint;
	public Printer(T valToPrint)
	{
		this.valToPrint=valToPrint;
		
	}
	
	public void print()
	{
		System.out.println(valToPrint);
	}
}
