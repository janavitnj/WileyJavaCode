package Day21;
class Test
{
	public static  int add(int v1,int v2)
	{
		int val=v1+v2;
		return val;
	}
}
public class MethodType {

	public void add(int v1,int v2)
	{
		int val=v1+v2;
		System.out.println("addition in instance method "+val);
	}
	
	public void sub(int v1,int v2)
	{
		int val=v1-v2;
		System.out.println("subtraction in instance method "+val);
		add(5,5);//one instance method can call other
	}
	
	public static void mul(int v1,int v2)
	{
		int val=v1*v2;
		System.out.println("multiplication  in static method "+val);
	}
	
	public static int multi(int v1,int v2)
	{
		int val=v1*v2;//we can call a static method inside a static method
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(10,20);
		
		MethodType m=new MethodType();
		m.add(10, 60);
		
		m.sub(0,9);
		
		int m1=multi(10,20);
		System.out.println(m1);
		
		
		System.out.println(Test.add(20, 30));
		
	}

}
