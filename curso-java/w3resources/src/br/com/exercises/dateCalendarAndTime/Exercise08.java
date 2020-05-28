package br.com.exercises.dateCalendarAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise08 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

		DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(dateFormat.format(calendar.getTime()));

		for (int i = 0; i < 6; i++) {
			calendar.add(Calendar.DATE, 1);
		}
		System.out.println(dateFormat.format(calendar.getTime()));
	}
}
