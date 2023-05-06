package Lambda;

public class LambdaClass {

	static String printThing(Printable thing)
	{
		return thing.print("s");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product myProd=new Product();
		//printThing(myProd);
		Printable lambda=(s)->{ return "hello "+s;};
		System.out.print(printThing(lambda));
	}

}
