package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadValidateDate {

	public static void main(String[] args) {
	
		String s="10.13.2000"; //dd.MM.yyyy
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
		sdf.setLenient(false);
		
		Date d=null;
		
		try {
			d=sdf.parse(s); //takes String object and parses it to date obj
			System.out.println("date parsed is = "+d);
		} catch (ParseException e) {
			System.out.println(e);
		}

	}

}
