package Apr27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat=Pattern.compile("agent (\\d{3,4}) (nj)");
		Matcher match=pat.matcher("agent 107 nj");
		
		System.out.println(match.find());
		//System.out.println(match.matches());
		
		System.out.println(match.group(0));
		
	}

}
