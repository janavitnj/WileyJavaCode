package Lambda;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.*;
public class BIFunctionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> n=a->a^1;
		System.out.println(n.apply(0));
		
		BinaryOperator<Integer> n1=(a,b)->a&b;
		System.out.println(n1.apply(10, 5));
	}

}
