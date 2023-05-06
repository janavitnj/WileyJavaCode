package Lambda;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {

	private static HashMap<Integer,String> Emp=new HashMap<>();
	public static void add(String name,int ID)
	{
		if(!Emp.containsKey(ID))
		Emp.put(ID,name);
		else
			System.out.println("Exists");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,String> get=(Integer ID)->
		{
			if(Emp.containsKey(ID)) return Emp.get(ID);
			else return "Invalid ID";
		};
		
		add("Janavi",10);
		add("steve",11);
		System.out.println(get.apply(11));
	}

}
