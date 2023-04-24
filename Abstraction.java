package Apr24;

abstract class Test1 {
	{
		System.out.println("This is instance block in abstract class");
	}

	public Test1() {
		System.out.println("This is constrcutor1");
	}

	public abstract void m1();

	public void m2() {
		System.out.println("Test1 m2 method");
	}

	static {
		System.out.println("static 1");
	}

	public static void main(String[] args) {
		System.out.println("This is main from abstract class");
	}
}

class Test2 extends Test1 {
	{
		System.out.println("This is instance block in Test2 class");
	}

	static {
		System.out.println("static 2");
	}

	public Test2() {
		System.out.println("This is constrcutor2");
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 of Test1 class");
	}

}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		t2.m1();
		t2.m2();

		t2.main(args);
	}

}
