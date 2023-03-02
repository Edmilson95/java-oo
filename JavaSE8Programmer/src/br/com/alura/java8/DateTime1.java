package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTime1 {

//		LocalDate = Data sem hora
//		LocalTime = hora 
//		LocalDateTime = data com hora
//		MonthDay = Dia de um mes
//		YearMonth = mes e ano
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = ldt.toLocalDate();
		LocalTime lt = ldt.toLocalTime();
		
		LocalDateTime ldt2 = ld.atTime(lt);
		LocalDateTime ldt3 = lt.atDate(ld);
		
		
//		MonthDay day1 = MonthDay.of(1, 1); // 1/jan
//		MonthDay day2 = MonthDay.of(1, 2);
//		
//		System.out.println(day1.isBefore(day2));
//		System.out.println(day1.isAfter(day2));
//		System.out.println(day1.equals(day2));
//		
//		LocalDate d = LocalDate.of(2020, 3, 20);
//		LocalDate d2 = d.withMonth(4).withYear(2019);
//		
//		System.out.println(d);
//		System.out.println(d2);
//		
//		LocalDate d3 = d.plusDays(5).plusMonths(3).minusYears(4);
//		System.out.println(d3);
//		
//		LocalDate d4 = d.minus(4, ChronoUnit.YEARS);
//		System.out.println(d4);
//	
//		LocalTime time = LocalTime.now(ZoneId.of("America/Chicago"));
//		LocalTime time2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
//		
//		System.out.println(time);
//		System.out.println(time2);
		
//		LocalTime meioDia = LocalTime.of(12, 0);
//		
//		LocalDate natal2014 = LocalDate.of(2014, 12, 25);
//		LocalDate natal2015 = LocalDate.of(2015, Month.DECEMBER, 25);
//		
//		System.out.println("Hora escolhida: " + meioDia);
//		System.out.println(natal2014);
//		System.out.println(natal2015);
//		
//		LocalDateTime algumMomento = LocalDateTime.of(2015, 12, 25, 12, 0);
//		LocalDateTime almocoNatal = LocalDateTime.of(natal2015, meioDia);
		
		
//		LocalDateTime ldt = LocalDateTime.of(2015, 12, 25, 12, 0);
//		System.out.println(ldt.getDayOfMonth());
//		System.out.println(ldt.getYear());
//		System.out.println(ldt.getMonth());
//		System.out.println(ldt.getHour());
//		
//		System.out.println(ldt.get(ChronoField.DAY_OF_WEEK)); // retorna qual dia da semana caiu a datetime
//		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));



		
		
		
		
		
		
		
		
		
		

		
		
	}
	
		
	
	
}
