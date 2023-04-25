package Apr25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\data1.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fout);
		String s="Hii I am Janavi";
		byte b[]=s.getBytes();
		
		try
		{
			bo.write(b);
			bo.flush();
			bo.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}*/
	
		FileInputStream fin=new FileInputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\data1.txt");
		BufferedInputStream bis=new BufferedInputStream(fin);
		
	
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		bis.close();
		fin.close();
	}

}
