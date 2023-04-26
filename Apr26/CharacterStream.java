package Apr26;

import java.io.*;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Writer out=new OutputStreamWriter(System.out);
		Writer fw=new FileWriter("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student6.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I like programming");
		bw.flush();
		bw.close();
		fw.close();*/
		
		//Reader out=new InputStreamReader(System.out);
		Reader fr=new FileReader("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student6.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		//br.flush();
		br.close();
		fr.close();
	}

}
