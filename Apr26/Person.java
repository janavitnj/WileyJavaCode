package Apr26;

import java.io.Serializable;

public class Person implements Serializable{
private static final long serialVersionid=2L;
int age;
String name;
public Person(int age,String name)
{
	super();
	this.age=age;
	this.name=name;
}

}
