package Apr24;


class Employee
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
}

class EmploImplement 
{
	public void show(Employee e)
	{
		System.out.println("Show method called");
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}
}
public class EmployeeEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("janavi");
		e.setAge(21);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		
		EmploImplement emp=new EmploImplement();
		emp.show(e);
	}

}
