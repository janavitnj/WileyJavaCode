package Apr26;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AbstractStream {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student4.txt");
		String str="Hello all";
		byte[] b=str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();*/
		
		
		InputStream fin=new FileInputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student5.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		
		fin.close();
	}
}
