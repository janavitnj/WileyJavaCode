package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtitlityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,4,1};
		
		Arrays.sort(a);
		for(int a1:a)
			System.out.println(a1);
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		Collections.sort(al);
		
	}

}
