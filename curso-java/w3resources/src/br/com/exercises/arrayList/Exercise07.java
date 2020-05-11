package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");

		if (listStrings.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
	}
}