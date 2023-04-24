package Day21;
class Vehicle
{
	public void tier()
	{
		System.out.println("tier");
		
	
	}
	
	public void steer()
	{
		System.out.println("steering");
	}
}

class Car extends Vehicle
{
	public void airbag()
	{
		System.out.println("airbag");
	}
}

class SmartCar extends Car
{
	public void sensor()
	{
		System.out.println("sensor");
	}
}
public class MultilevelIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartCar s=new SmartCar();
		
		s.sensor();
		s.airbag();
		s.steer();
	}

}
