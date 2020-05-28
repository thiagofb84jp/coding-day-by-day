package br.com.exercises.dateCalendarAndTime;

import java.util.Calendar;

public class Exercise02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}