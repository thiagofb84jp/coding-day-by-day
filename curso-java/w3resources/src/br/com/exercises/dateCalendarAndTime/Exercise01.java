package br.com.exercises.dateCalendarAndTime;

import java.text.DateFormatSymbols;

public class Exercise01 {
	
	public static void main(String[] args) {
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
		
		String[] dayNames = dateFormatSymbols.getWeekdays();
		
		System.out.print("************ DAYS OF WEEK ************");
		for (String string: dayNames) {
			System.out.println(string);
		}
		System.out.print("************ END ************");
	}
}
