package Day21;

public class CreateClass implements Cloneable {
	int a=10;
	
	public void add()
	{
		System.out.println("Number adding");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		//Create a object with new keyword
		CreateClass cc=new CreateClass();
		
		cc.add();
		
		System.out.println(cc);
		
		//Create object with new instance
		try {
			Class c=Class.forName("Day21.CreateClass");
			CreateClass c1=(CreateClass)c.newInstance();
			c1.add();
			System.out.println(c1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create object with Object.clone method
		//here address of object changes
		//in object assignment it doesnt
		
		CreateClass objClone =(CreateClass) cc.clone();
		System.out.println(objClone);
	}

}
