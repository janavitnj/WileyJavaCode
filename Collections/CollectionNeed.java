package Collections;
class Student{}
class Book{}

public class CollectionNeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studs=new Student[10];
		studs[0]=new Student();
		studs[1]=new Student();
		//Fixed in size
		//array cant hold heterogenous elements
		
		Object[] objs=new Object[10];
		objs[0]=new Student();
		objs[1]=new Student();
		//readymade api support is not provided
		
		
	}

}
