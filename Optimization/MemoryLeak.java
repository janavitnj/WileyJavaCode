package Optimization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MemoryLeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("myfile.txt");
		}catch(FileNotFoundException e)
		{
	    	e.printStackTrace();
		}finally
		{
			if(fis!=null)
			{
				try {
					fis.close();
				}catch(IOException e2)
				{
					e2.printStackTrace();
				}
			}
		}
		
		try(FileInputStream fis=new FileInputStream("bookj.txt"))
		{
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
