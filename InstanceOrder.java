package Day21;

public class InstanceOrder {
	
	String name;
	int age;
	
	{
		name="janavi";
		age=21;
		System.out.println("Instance block");
	}
	
	public InstanceOrder()
	{
		System.out.println("name:"+name+" age:"+age);
		System.out.println("Inside zero constructor");
	}
	
	public InstanceOrder(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	
	public InstanceOrder(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+"  "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceOrder io=new InstanceOrder();
		new InstanceOrder(10,20);
		
		new InstanceOrder("janu",20);
	}

}
