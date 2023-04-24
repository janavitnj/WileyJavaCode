package Day21;

public class VarScope {
	
	int ins=90;
	static int stat=70;
	int val=10;
	int val1=20;
	
	public void sum()
	{
		int val=90;
		int val1=90;
		System.out.println("sum of local variables ="+(val+val1));
		System.out.println("sum of instance variables ="+(this.val+this.val1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarScope v=new VarScope();
		int loc=80;
		int val=20;
		
		v.sum();
		System.out.println("Local variable "+loc);
		System.out.println("INstance variable "+v.ins);
		System.out.println("Static variable "+stat);
		//cant use this in static area
	}

}
