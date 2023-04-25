package Apr25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Apr25.Student1; 

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Student1 student) throws IOException {
		/*dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.getGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());*/
		String s=student.getName()+" "+student.getGender()+" "+student.getGrade()+" "+student.getAge()+"\n";
		dataOutput.writeBytes(s);
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	
	public static void main(String[] args) {
		/*if(args.length < 1) {
			System.out.println("Please provide output file");
			System.exit(0);
		}*/
		
		String outputfile = "C:\\Users\\91966\\Desktop\\wileyjavacode\\src\\Apr25\\student1.txt";
		
		List<Student1> listStudent = new ArrayList<>(); 
		
		listStudent.add(new Student1("venkat", true, 28, 90.1f));
		listStudent.add(new Student1("Anmol", true, 21, 81.5f));
		listStudent.add(new Student1("Shreya", false, 18, 91.1f));
		listStudent.add(new Student1("Rishav", true, 19, 95.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(Student1 student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



