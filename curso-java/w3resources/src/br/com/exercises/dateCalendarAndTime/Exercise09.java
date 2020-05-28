package br.com.exercises.dateCalendarAndTime;

import java.util.Calendar;

public class Exercise09 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("\nCurrent Date and Time: " + calendar.getTime());

		int actualMaxYear = calendar.getActualMinimum(Calendar.YEAR);
		int actualMaxMonth = calendar.getActualMinimum(Calendar.MONTH);
		int actualMaxWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = calendar.getActualMinimum(Calendar.DATE);

		System.out.println("Actual Minimum Year: " + actualMaxYear);
		System.out.println("Actual Minimum Month: " + actualMaxMonth);
		System.out.println("Actual Minimum Week of Year: " + actualMaxWeek);
		System.out.println("Actual Minimum Date: " + actualMaxDate);
	}
}
