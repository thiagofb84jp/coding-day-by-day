package br.com.exercises.dateCalendarAndTime;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Exercise12 {
	public static void main(String[] args) {
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(new Locale("de"));
		
		String[] dayNames = dateFormatSymbols.getWeekdays();
		
		System.out.print("************ DAYS OF WEEK [IN GERMAN] ************");
		for (String string : dayNames) {
			System.out.println(string);
		}
		System.out.print("************ END ************");
	}
}