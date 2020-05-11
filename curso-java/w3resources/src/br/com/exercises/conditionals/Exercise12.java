package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise12 {

	/**
	 * Exercise 12: Write a Java program to find the number of days in a month.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numberOfDaysInMonth = 0;
		String monthOfName = "Unknown";

		System.out.println("Input a month number: ");
		int month = in.nextInt();

		System.out.println("Input a year: ");
		int year = in.nextInt();

		switch (month) {
		case 1:
			monthOfName = "January";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			monthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 3:
			monthOfName = "March";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			monthOfName = "April";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			monthOfName = "May";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			monthOfName = "June";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			monthOfName = "July";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			monthOfName = "August";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			monthOfName = "September";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			monthOfName = "October";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			monthOfName = "November";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			monthOfName = "December";
			numberOfDaysInMonth = 31;
			break;
		default:
			System.out.println("Out of range.");
			break;
		}
		System.out.println(monthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");

		in.close();
	}
}