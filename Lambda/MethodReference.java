package Lambda;
interface GetInfo
{
	Info getMesg(String str);
}
class Info
{
	Info(String str)
	{
		System.out.println(str);
	}
}
interface Sayable
{
	void say();
}
public class MethodReference {
	public void hello()
	{
		System.out.println("hiiiii");
	}
	public static void saySomething()
	{
		System.out.println("hellloooo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable=MethodReference::saySomething;
		sayable.say();
		MethodReference mt=new MethodReference();
		Sayable isv=mt::hello;
		isv.say();
		
		Thread t1=new Thread(mt::hello);
		t1.start();
		
		 GetInfo info=Info::new;
		 info.getMesg("my");
	}

}
