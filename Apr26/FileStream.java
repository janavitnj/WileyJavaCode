package Apr26;
import java.util.*;
import java.io.*;
public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student4.txt");
		String str="Hello all";
		byte[] b=str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();*/
		
		
		FileInputStream fin=new FileInputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student4.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		
		fin.close();
	}

}
