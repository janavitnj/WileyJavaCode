package Apr27;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CreditCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s="1000-1000-1000-1000";
		String re="\\d{4}-\\d{4}-\\d{4}-";
		Pattern pat=Pattern.compile(re);
		Matcher match=pat.matcher(s);
		
		String maskedNumber=match.replaceAll("xxxx-xxxx-xxx-");
		System.out.println(maskedNumber);
		
	}

}
