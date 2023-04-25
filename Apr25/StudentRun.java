package Apr25;
import java.io.*;
import java.util.ArrayList;
class Student
{
	String name;
	String gender;
	int age;
	int sem;
	
	
	Student(String n,String g,int a,int s) throws IOException
	{
		this.name=n;
		this.gender=g;
		this.age=a;
		this.sem=s;
		
		//FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student.txt");
		//DataOutputStream dos=new DataOutputStream(fout);
		String s1="NAME:"+name+" GENDER:"+gender+" AGE:"+age+" SEM:"+sem;
		StudentRun.ar.add(s1);
		//System.out.println(ar);
		
	}
}

public class StudentRun {
	static ArrayList<String> ar=new ArrayList<String>();
	
	public static void save() throws IOException
	{

		String str="";
		FileOutputStream fout=new FileOutputStream("C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student.txt");
		DataOutputStream dos=new DataOutputStream(fout);
		for(String s:ar)
		{
			str+=s+"\n";
		}
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
	public static void main(String[] args) throws IOException
	{
		Student s=new Student("janavi","f",21,8);
		Student s1=new Student("janavitnj","f",21,8);
		Student s2=new Student("janu","f",21,8);
		save();
	
	}
}
