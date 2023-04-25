package Apr25;

import java.util.*;
public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hii,janavi";
		StringTokenizer s=new StringTokenizer("hello,all,hii",",");
		System.out.println(s.countTokens());
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
	}

}
