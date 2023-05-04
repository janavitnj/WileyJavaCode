package Collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Geniusstudent> {

	@Override
	public int compare(Geniusstudent o1, Geniusstudent o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary())
			return 0;
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		else
			return -1;
	}

}
