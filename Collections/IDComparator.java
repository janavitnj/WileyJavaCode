package Collections;

import java.util.Comparator;

public class IDComparator implements Comparator<Geniusstudent> {

	@Override
	public int compare(Geniusstudent o1, Geniusstudent o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId())
			return 1;
		else
			return -1;
	}
	
	
}
