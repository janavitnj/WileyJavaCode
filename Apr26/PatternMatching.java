package Apr26;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="The quick way to Learn programming is consistance practice";
		Pattern pattern=Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(input);
		System.out.println(matcher);
		
		//System.out.println(matcher.find());
		
		if(matcher.find())
		{
			int start=matcher.start();
			int end=matcher.end();
			
			
			System.out.println("Found at index "+start+" ends at "+end);}}

}
