package br.com.alura.java8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateTime3 {
	//api antiga date
	
	public static void main(String[] args) {
		
		Date d = new Date();
		Instant i = d.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		Calendar c = Calendar.getInstance();
		Instant i2 = c.toInstant();
		LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());
		
		System.out.println(d);
		
		Instant i3 = ldt.toInstant(ZoneOffset.UTC);
		Date d2 = Date.from(i3);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		System.out.println(d2);
		
		
		
	}
}
