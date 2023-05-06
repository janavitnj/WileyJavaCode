package Lambda;
import java.util.function.*;
public class BuiltInSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> msg=()->"hello";
		System.out.println(msg.get());
	}

}
