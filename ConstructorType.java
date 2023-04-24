package Day21;

public class ConstructorType {
	
	public ConstructorType(int a,int b)
	{
		System.out.println("2 args count int:"+(a+b));
	}
	
	public ConstructorType()
	{
		System.out.println("Zero arguement constructor");
	}
	
	public ConstructorType(float a,int b)
	{
		this(2,3);//constructor call must be on top
		System.out.println("2 args count float:"+(a+b));
	}
	public void add()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorType ct=new ConstructorType(10,20);
		ConstructorType ct1=new ConstructorType();
		ConstructorType ct2=new ConstructorType(10.0f,20);

	}

}
