package Apr26;

import java.io.*;

public class SerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person b=new Person(10,"Java book");
		
		try
		{
			FileOutputStream fos=new FileOutputStream("person.ser");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(b);
			os.close();
			System.out.println("Task done");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
