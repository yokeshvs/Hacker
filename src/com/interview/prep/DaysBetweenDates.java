package com.interview.prep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
	public static void main(String[] args) {
		String a = "02 01 2018";
		String b = "03 01 2018";
		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date1 = LocalDate.parse(a, dateTimeFormatter);
		LocalDate date2 = LocalDate.parse(b, dateTimeFormatter);
		long days = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(days);
	}
}
