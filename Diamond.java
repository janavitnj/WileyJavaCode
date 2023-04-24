package Day21;


interface Person
{
	public void getRole();
}

interface Student extends Person{}

class Teacher implements Person
{

	@Override
	public void getRole() {
		// TODO Auto-generated method stub
		System.out.println("Teaching");
	}
	
}

class ClassRoom extends Teacher implements Student
{
	public void getRole()
	{
		System.out.println("Classroom teaching");
	}
}
public class Diamond {
	public static void main(String[] args)
	{
		ClassRoom c=new ClassRoom();
		c.getRole();
		
		
	}
}
