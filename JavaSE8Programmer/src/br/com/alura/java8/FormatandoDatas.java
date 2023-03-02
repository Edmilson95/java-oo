package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class FormatandoDatas {

	public static void main(String[] args) {
		
		
//		LocalDateTime agora = LocalDateTime.now();
//		System.out.println(agora);
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		System.out.println(formatter.format(agora));
//		System.out.println(agora.format(formatter));
//		LocalDate d1 = LocalDate.parse("09-08-1995", formatter);
//		System.out.println(d1);

	    System.out.println(YearMonth.now().isSupported(
	        ChronoUnit.MONTHS));
	    System.out.println(YearMonth.now().isSupported(
	        ChronoField.DAY_OF_MONTH));
	    System.out.println(MonthDay.now().isSupported(
	        ChronoField.DAY_OF_MONTH));
	    System.out.println(LocalDate.now().isSupported(
	        ChronoUnit.DAYS));
	    System.out.println(LocalDate.now().isSupported(
	        ChronoUnit.YEARS)); 
	    System.out.println(LocalDateTime.now().isSupported(
	        ChronoField.HOUR_OF_AMPM));
	    System.out.println(LocalDateTime.now().isSupported(
	        ChronoField.YEAR));
		
		
	}
	
}
