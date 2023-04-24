package Apr24;

import java.util.ArrayList;

class StringNotFound extends RuntimeException
{
	public StringNotFound(String s)
	{
		super(s);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "String is not added to list";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StringNotFound Exception class";
	}
}
public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("janavi");
		a.add("abcd");
		
		if(!a.contains("xyz"))
		{
			try
			{
				throw new StringNotFound("This string not in list");
				
			}catch(StringNotFound e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				e.toString();
			}
		}
		else
		{
			System.out.print("found");
		}
		
		System.out.println("Last statemnt");
	}

}
