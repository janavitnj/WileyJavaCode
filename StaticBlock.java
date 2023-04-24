package Day21;

public class StaticBlock {
	static
	{
		System.out.println("In static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	public StaticBlock()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb=new StaticBlock();
		new StaticBlock();
		//static -1  instance-2  constructor-2
	}

}
