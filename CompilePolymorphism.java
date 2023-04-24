package Day21;

public class CompilePolymorphism {

	public void add(int n1,int n2)
	{
		System.out.println("Result is "+(n1+n2));
	}
	
	public void add(int n1,int n2,int n3)
	{
		System.out.println("Result is "+(n1+n2+n3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompilePolymorphism c=new CompilePolymorphism();
		c.add(1, 2);
		c.add(2, 3, 4);
	}

}
