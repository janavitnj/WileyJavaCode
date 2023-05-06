package Lambda;

public interface Child extends Parent{
	public void sayParent();
	default void sayHi()
	{
		
	}
}
