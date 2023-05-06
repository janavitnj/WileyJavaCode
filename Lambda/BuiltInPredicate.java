package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checkLength=(String s)->s.length()==4;
		List<String> fi= Arrays.asList("Java","Python","angular");
		
		fi.forEach(l->{
			if(checkLength.test(l))
			{
				System.out.println(l);
			}
		});
	}

}
