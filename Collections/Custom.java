package Collections;

import java.util.*;

public class Custom extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
//		CustomArrayList list = new CustomArrayList();
//		
//		list.add(1);
//		list.add(2);
//		list.add(1);
//		list.add(4);
//		list.add(3);
//		list.add(6);
//		list.add(6);
//		
//		System.out.println(list);
		
		
		
		List<Geniusstudent> setStudent = new ArrayList<>();
		
		Geniusstudent gst1 = new Geniusstudent(101, "Rishav",1000);
		Geniusstudent gst2 = new Geniusstudent(103, "Me",3000);
		Geniusstudent gst3 = new Geniusstudent(102, "Steve",2000);
		
		setStudent.add(gst1);
		setStudent.add(gst2);
		setStudent.add(gst3);
		
		Collections.sort(setStudent,new SalaryComparator());
		
		System.out.println(setStudent);
	}

}