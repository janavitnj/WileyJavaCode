package Lambda;
import java.util.function.*;;
public class BuilInConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> el=(Integer age,Integer per)->{
	if(age>18 && per>75)
		System.out.println("You are elgible for job");
	else
		System.out.println("Not eleigible");
		};
el.accept(16, 89);
}
}