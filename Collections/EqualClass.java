package Collections;
import java.util.*;
public class EqualClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=4;
		int n2=4;
		if(n1==n2)
			System.out.println("Numbers are equal");
		else
			System.out.println("Numbers are not equal");
		
		String str1=new String("Wiley");
		String str2=new String("Wiley");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		Dog d=new Dog();
		Dog d1=new Dog();
		
		System.out.println(d.equals(d1));
		final List<Integer> alis=new ArrayList<>();
		alis.add(1);
		alis.add(1);
		alis.remove(0);
		System.out.println(alis);
		
		
	}

}
