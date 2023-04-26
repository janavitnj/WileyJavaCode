package Apr26;
import java.io.*;
public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c= System.console();
		
		if(c==null)
		{
			System.out.println("Console not available");
		}
		
		String name=c.readLine("name:");
		char pass[]=c.readPassword("pass:");
		System.out.println(name);
		System.out.println(new String(pass));
	}

}
