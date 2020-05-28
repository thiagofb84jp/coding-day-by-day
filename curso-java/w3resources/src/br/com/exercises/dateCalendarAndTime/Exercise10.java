package br.com.exercises.dateCalendarAndTime;

import java.util.Calendar;

public class Exercise10 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.getTime());
	}
}