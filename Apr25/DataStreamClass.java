package Apr25;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\data3.txt");
		DataOutputStream dos=new DataOutputStream(fout);
		
		dos.writeBytes("I am a programmer");
		dos.flush();
		dos.close();*/
		
		FileInputStream fin=new FileInputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\data3.txt");
		DataInputStream dos=new DataInputStream(fin);
		
		int count=fin.available();
		byte[] ba=new byte[count];
		
		dos.read(ba);
		
		for(byte b:ba)
		{
			System.out.print((char)b);
		}
		dos.close();
		fin.close();
}

}
