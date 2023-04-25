package Apr25;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Janavi";
		int age=21;
		float salary=10.20f;
		
		System.out.format("hello i am %s, I am %d year old%n",name,age);
		
		List<String> book=Arrays.asList("alechemist","ikigai","hamlet");
		
		for(String s:book)
		{
			System.out.format("%-30s - in stock%n",s);
		}
	}

}
