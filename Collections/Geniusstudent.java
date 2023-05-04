package Collections;

import java.util.*;

public class Geniusstudent implements Comparable<Geniusstudent> {
	
	int id;
	String name;
	double salary;
	
	public Geniusstudent(int id, String name,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GeniusStudent [id=" + id + ", name=" + name +", salary= "+salary+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geniusstudent other = (Geniusstudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Geniusstudent o) {
		 
		if(id == o.id)
		{
			return 0;
		}
		else if(id > o.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}