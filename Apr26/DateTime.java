package Apr26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myDate=LocalDate.now();
		
		System.out.println(myDate);
		LocalTime myTime=LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime myDateTime=LocalDateTime.now();
		System.out.println(myDateTime);
		DateTimeFormatter mdf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String modDateTime = myDateTime.format(mdf);
		System.out.println(modDateTime);
		String datestr="26/04/2023";
		//LocalData date=Local
		System.out.println(myDateTime);
	}

}
