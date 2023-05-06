package Assignment;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamClass {
	public static void main(String[] args) {
		

		Student101 s1=new Student101(1,"Janavi",50);
		Student101 s2=new Student101(2,"Partha",100);
		Student101 s3=new Student101(3,"Tejas",75);
		Student101 s4=new Student101(4,"Pranav",85);
		Student101 s5=new Student101(5,"Mansi",35);
		Student101 s6=new Student101(6,"Deepthi",110);
		Student101 s7=new Student101(7,"Neha",10);
		List<Student101> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		Stream<Student101> top = list.stream();
		
		
	     List<Student101> l= top.filter(s->s.getProblems()>=50)
	    		 .sorted(new StudentScoreComparator()).limit(5)
	    		 .collect(Collectors.toList());
	     System.out.println("Top 5 students are");
	     for(Student101 s:l)
	     {
	    	 System.out.println(s.getName()+"   "+s.getProblems());
	     }
	     
	     Stream<Student101> sl=list.stream();
	     List<Student101> sorted=sl.sorted(new StudentScoreComparator()).collect(Collectors.toList());
	     System.out.println("List of students sorted based on scores");
	     for(Student101 s:sorted)
	     {
	    	 System.out.println(s.getId()+"    "+s.getName()+"   "+s.getProblems());
	     }
	}
}














