package wileyjava;

public class Conditional {
	
	public static double cartValue(float ...args)
	{
		int sum=0;
		for(float i:args)
		{
			sum+=i;
		}
		
		
		if(sum>10000)
		{
			double discount= (10/100.0)*sum;
			System.out.println("Dicount applied");
			return sum-discount;
		}
		else 
			return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a[]= {5000,5000,15000};
		
		System.out.println("Price is "+cartValue(a));
	}

}
