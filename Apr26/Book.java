package Apr26;

import java.io.Serializable;

public class Book implements Serializable{
private static final long serialVersionid=1L;
int bookcode;
String bookname;
public Book(int bookcode,String bookname)
{
	super();
	this.bookcode=bookcode;
	this.bookname=bookname;
}

}
