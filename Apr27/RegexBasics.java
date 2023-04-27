package Apr27;
import java.util.regex.*;
public class RegexBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re="..";
		String re1="\\w\\w";//a-z 0-9
		String re3="\\s\\S";//space and non space
		String re2="\\d";//numbers
		String text=" a";//if text is abc then false
		Pattern pat=Pattern.compile(re3);
		Matcher mat=pat.matcher(text);
		System.out.println(mat.matches());
		
	}

}
