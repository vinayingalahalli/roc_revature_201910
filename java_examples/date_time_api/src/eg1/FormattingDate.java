package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingDate {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		
		/*
		 * yyyy - year in 4 digit  , yy - last 2 digits of year
		 * MM - month in 2 digits, MMM - Shortname of the month, MMMM - Full month name
		 * dd - date
		 * hh - 12hr
		 * HH - 24hr
		 * mm - minutes
		 * ss - seconds
		 * a - am/pm
		 * z/Z - zone
		 * EEE - short name of the day, EEEE - full name of the day
		 */
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yy hh:mm:ss z a EEEE");
		System.out.println(sdf.format(d)); //format takes the dateobj and prints the formatted date as String 
	}

}
