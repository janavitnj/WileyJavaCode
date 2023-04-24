package Day21;
class Principal
{
	public void collegeWork()
	{
		System.out.println("handles the college work");
	}
}

class CSHod extends Principal
{
	public void csWork()
	{
		System.out.println("handles CSE department work in particular");
	}
}

class ISHod extends Principal
{
	public void isWork()
	{
		System.out.println("handles ISE department work in particular");
	}
}

class CsFaculty extends CSHod
{
	public void teach()
	{
		System.out.println("Teaches cse");
	}
}
public class HybridIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsFaculty f=new CsFaculty();
		f.csWork();
		f.teach();
		
		ISHod i=new ISHod();
		i.collegeWork();
		i.isWork();
		
	}

}
