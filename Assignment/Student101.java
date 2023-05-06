package Assignment;

import java.util.Comparator;

import Collections.Geniusstudent;

class StudentScoreComparator implements Comparator<Student101> {

	@Override
	public int compare(Student101 o1, Student101 o2) {
		// TODO Auto-generated method stub
		if(o1.getProblems()==o2.getProblems())
			return 0;
		else if(o1.getProblems()>o2.getProblems())
			return 1;
		else
			return -1;
	}

  
	
}
public class Student101 {
	private int id;
	private String name;
	private int problems;
	
	public Student101(int id, String name, int problems) {
		super();
		this.id = id;
		this.name = name;
		this.problems = problems;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProblems() {
		return problems;
	}
	public void setProblems(int problems) {
		this.problems = problems;
	}
	@Override
	public String toString() {
		return "Student101 [id=" + id + ", name=" + name + ", problems=" + problems + "]";
	}
	
	
}
