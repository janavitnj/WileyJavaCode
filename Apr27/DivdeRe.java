package Apr27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivdeRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="10 divide by 2";
		String re="^(\\d*) divide by (\\d*)$";
		Pattern pat=Pattern.compile(re);
		Matcher match=pat.matcher(s);
		
		if(match.find())
		{
			String simp="result:"+match.replaceAll("$1$2");
			int res=Integer.valueOf(match.group(1))/Integer.valueOf(match.group(2));
			System.out.println(res);
		}
		
	}

}
