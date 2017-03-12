package com.jnit.session4.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
//java.time ->LocalDate, LocalDateTime, LocalTime
//we can not use new keywords on LD,LDT,LT
//immutable object

//Period and duration
public class DateMain {
	//yyyy-mm-ddThh:mm:ss:SSS
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime time = LocalTime.now();
		System.out.println(today);
		System.out.println(dateTime);
		System.out.println(time);
		LocalDate yesterday= LocalDate.of(2016, 10, 31);
		System.out.println(yesterday);
		LocalDateTime ydt = LocalDateTime.of(2016, 10, 31, 10, 30);
		System.out.println(ydt);
		//minus and plus operations
		LocalDate date_15 = today.minusDays(15);
		date_15 = date_15.minusWeeks(2);
		today.minusMonths(2);
		today.minusYears(2);
		//Duration -> time
		today = today.minus(Period.of(1, 2, 10));
		//time.mi
		today = today.minus(Duration.ofDays(10));
		//chaining operations
		LocalDate date_16 = today.minusDays(15).minusMonths(2);
		//chaining not possible with period
		//dont chain static methods
		Period period = Period.ofDays(10).ofWeeks(2);
		
		Date oldway = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.JANUARY, 15);
		Date janDate = calendar.getTime();
	}

}
