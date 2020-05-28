package br.com.exercises.dateCalendarAndTime;

import java.time.YearMonth;

public class Exercise03 {
	public static void main(String[] args) {
		YearMonth yearMonth = YearMonth.of(2020, 5);
		
		String firstDay = yearMonth.atDay(1).getDayOfWeek().name();
		String lastDay = yearMonth.atEndOfMonth().getDayOfWeek().name();
		System.out.println(firstDay);
		System.out.println(lastDay);
	}
}