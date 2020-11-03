package java8timeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Demo1 {

	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		ld=ld.plusYears(10);
		System.out.println(ld);
		ld=ld.plusMonths(11);
		System.out.println(ld);
		ld=ld.minusYears(15);
		ld=ld.minusDays(100);
		ld=ld.minusWeeks(7);
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		
		LocalDate dob=LocalDate.parse("12-10-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("dob = "+dob);
		LocalDate curr=LocalDate.now();
		System.out.println("curr = "+curr);
		
		Period p=Period.between(dob, curr);
		System.out.println("You are "+p.getYears()+" year/s "+p.getMonths()+" month/s "+p.getDays()+" day/s old or young");

		System.out.println(ChronoUnit.DAYS.between(dob, curr));
		System.out.println(ChronoUnit.MONTHS.between(dob, curr));
		System.out.println(ChronoUnit.YEARS.between(dob, curr));
	}

} //LocalTime, LocalDateTime
