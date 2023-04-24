package Apr24;

abstract class Vehicle
{
	protected String color;
	protected int wheels;
	
	public Vehicle(String s,int w)
	{
		this.color=s;
		this.wheels=w;
	}
	
	public Vehicle(String s)
	{
		this.color=s;
		
	}
	
	abstract public void move();
}

class Cars extends Vehicle
{

	public Cars(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	public Cars(String s, int w) {
		super(s, w);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car moves");
	}
	
}
public class CarAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c=new Cars("blue",120);
		c.move();
	}

}
