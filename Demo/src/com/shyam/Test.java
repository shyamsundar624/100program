package com.shyam;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		String str= "22-04-2025";
		LocalDate localDate=LocalDate.now();
		
		LocalDate minusDays = localDate.minusDays(60);
		DayOfWeek dayOfWeek = minusDays.getDayOfWeek();
		
		System.out.println(dayOfWeek);

	}
}
