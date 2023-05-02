package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    ArrayList<Integer> al=new ArrayList<>();
    
   
    al.add(9);
    al.add(3);
    al.add(4);
    al.add(9);
    //al.remove(4); removes value at index 4
    al.remove(new Integer(4)); //To remove the value 4
    System.out.println(al);
    
    ArrayList<String> a=new ArrayList();
    a.add("ab");
    
    List<Integer> firstFivePrimeNumbers  = new ArrayList<>();
	firstFivePrimeNumbers.add(2);
	firstFivePrimeNumbers.add(3);
	firstFivePrimeNumbers.add(5);
	firstFivePrimeNumbers.add(7);
	firstFivePrimeNumbers.add(11);
	
	
	List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
	
	List<Integer> nextFivePrimeNumbers = new ArrayList<>();
	nextFivePrimeNumbers.add(13);
	nextFivePrimeNumbers.add(17);
	nextFivePrimeNumbers.add(19);
	nextFivePrimeNumbers.add(23);
	nextFivePrimeNumbers.add(29);
	
	firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
	
	System.out.println(firstTenPrimeNumbers);
    
	}

}
