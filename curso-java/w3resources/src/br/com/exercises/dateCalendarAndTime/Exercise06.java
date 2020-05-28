package br.com.exercises.dateCalendarAndTime;

import java.util.Calendar;

public class Exercise06 {
	
	public static void main(String[] args) {
		int year = 2020;
		int month = 4;
		int date = 28;
		
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		
		System.out.println(calendar.getTime());
	}
}