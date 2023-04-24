package Day21;
class Vehicle1
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

class Car1 extends Vehicle1
{
	public void airbag()
	{
		System.out.println("airbag");
	}
}

class Truck extends Vehicle1
{
	public void pump()
	{
		System.out.println("pump");
	}
}
public class HierarIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Truck t=new Truck();
        t.pump();
        
        Car c=new Car();
        c.airbag();
	}

}
