package Optimization;

public class DefineClass {

	//Inefficient way
	private Object DefineClass=new Object();
	
	private Object myobj;
	public Object getMyObject()
	{
		if(myobj==null)
		{
			myobj=new Object();
		}
		return myobj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
