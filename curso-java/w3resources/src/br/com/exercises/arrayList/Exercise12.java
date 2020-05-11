package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise12 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");
		listStrings.add("Blue");

		Collections.sort(listStrings);

		System.out.println("Original list: " + listStrings);

		List<String> subList = listStrings.subList(0, 3);

		System.out.println("List of the first three elements: " + subList);
	}
}